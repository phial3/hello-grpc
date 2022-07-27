### gRPC 允许你定义四类服务方法：

- 单项 RPC，即客户端发送一个请求给服务端，从服务端获取一个应答，就像一次普通的函数调用。

```protobuf
rpc SayHello(HelloRequest) returns (HelloResponse){
}
```

- 服务端流式 RPC，即客户端发送一个请求给服务端，可获取一个数据流用来读取一系列消息。客户端从返回的数据流里一直读取直到没有更多消息为止。

```protobuf
rpc LotsOfReplies(HelloRequest) returns (stream HelloResponse){
}
```

- 客户端流式 RPC，即客户端用提供的一个数据流写入并发送一系列消息给服务端。一旦客户端完成消息写入，就等待服务端读取这些消息并返回应答。

```protobuf
rpc LotsOfGreetings(stream HelloRequest) returns (HelloResponse) {
}
```

- 双向流式 RPC，即两边都可以分别通过一个读写数据流来发送一系列消息。这两个数据流操作是相互独立的，所以客户端和服务端能按其希望的任意顺序读写，例如：服务端可以在写应答前等待所有的客户端消息，或者它可以先读一个消息再写一个消息，或者是读写相结合的其他方式。每个数据流里消息的顺序会被保持。

```protobuf
rpc BidiHello(stream HelloRequest) returns (stream HelloResponse){
}
```

### 使用 API 接口

gRPC 提供 protocol buffer 编译插件，能够从一个服务定义的 .proto 文件生成客户端和服务端代码。通常 gRPC 用户可以在服务端实现这些API，并从客户端调用它们。

- 在服务侧，服务端实现服务接口，运行一个 gRPC 服务器来处理客户端调用。gRPC 底层架构会解码传入的请求，执行服务方法，编码服务应答。
- 在客户侧，客户端有一个存根（STUB）实现了服务端同样的方法。客户端可以在本地存根调用这些方法，用合适的 protocol buffer 消息类型封装这些参数— gRPC 来负责发送请求给服务端并返回服务端 protocol buffer 响应。

### RPC 生命周期

现在让我们来仔细了解一下当gRPC客户端调用gRPC服务端的方法时到底发生了什么。我们不究其实现细节，关于实现细节的部分，你可以在我们的特定语言页面里找到更为详尽的内容。

#### 单项 RPC

首先我们来了解一下最简单的 RPC 形式：客户端发出单个请求，获得单个响应。

- 一旦客户端通过桩调用一个方法，服务端会得到相关通知 ，通知包括客户端的元数据，方法名，允许的响应期限（如果可以的话）

- 服务端既可以在任何响应之前直接发送回初始的元数据，也可以等待客户端的请求信息，到底哪个先发生，取决于具体的应用。
- 一旦服务端获得客户端的请求信息，就会做所需的任何工作来创建或组装对应的响应。如果成功的话，这个响应会和包含状态码以及可选的状态信息等状态明细及可选的追踪信息返回给客户端 。
  假如状态是 OK 的话，客户端会得到应答，这将结束客户端的调用。

#### 服务端流式 RPC

服务端流式 RPC 除了在得到客户端请求信息后发送回一个应答流之外，与我们的简单例子一样。在发送完所有应答后，服务端的状态详情(状态码和可选的状态信息)和可选的跟踪元数据被发送回客户端，以此来完成服务端的工作。客户端在接收到所有服务端的应答后也完成了工作。

#### 客户端流式 RPC

客户端流式 RPC 也基本与我们的简单例子一样，区别在于客户端通过发送一个请求流给服务端，取代了原先发送的单个请求。服务端通常（但并不必须）会在接收到客户端所有的请求后发送回一个应答，其中附带有它的状态详情和可选的跟踪数据。

#### 双向流式 RPC

双向流式 RPC ，调用由客户端调用方法来初始化，而服务端则接收到客户端的元数据，方法名和截止时间。服务端可以选择发送回它的初始元数据或等待客户端发送请求。
下一步怎样发展取决于应用，因为客户端和服务端能在任意顺序上读写 - 这些流的操作是完全独立的。例如服务端可以一直等直到它接收到所有客户端的消息才写应答，或者服务端和客户端可以像"乒乓球"一样：服务端后得到一个请求就回送一个应答，接着客户端根据应答来发送另一个请求，以此类推。

#### 截止时间

gRPC 允许客户端在调用一个远程方法前指定一个最后期限值。这个值指定了在客户端可以等待服务端多长时间来应答，超过这个时间值 RPC 将结束并返回DEADLINE_EXCEEDED错误。在服务端可以查询这个期限值来看是否一个特定的方法已经过期，或者还剩多长时间来完成这个方法。
各语言来指定一个截止时间的方式是不同的 - 比如在 Python 里一个截止时间值总是必须的，但并不是所有语言都有一个默认的截止时间。

#### RPC 终止

在 gRPC 里，客户端和服务端对调用成功的判断是独立的、本地的，他们的结论可能不一致。这意味着，比如你有一个 RPC 在服务端成功结束("我已经返回了所有应答!")，到那时在客户端可能是失败的("应答在最后期限后才来到!")。也可能在客户端把所有请求发送完前，服务端却判断调用已经完成了。

#### 取消 RPC

无论客户端还是服务端均可以再任何时间取消一个 RPC 。一个取消会立即终止 RPC 这样可以避免更多操作被执行。它不是一个"撤销"， 在取消前已经完成的不会被回滚。当然，通过同步调用的 RPC 不能被取消，因为直到 RPC 结束前，程序控制权还没有交还给应用。



### Rust中使用gRPC步骤

#### 一、安装protoc

预先安装

`sudo apt-get install autoconf automake libtool curl make g++ unzip`

获取源码，生成configure

```bash
git clone https://github.com/google/protobuf.git
cd protobuf
git submodule update --init --recursive
./autogen.sh
```



编译安装

```bash
./configure  #By default, the package will be installed to /usr/local
make
make check
sudo make install
sudo ldconfig # refresh shared library cache.
```

#### 二、安装插件protoc-gen-rust和protoc-gen-rust-grpc

使用cargo 安装：

```rust
cargo install cargo-edit // 有可能导致安装不了，需要安装依赖,sudo apt-get install libssh-dev pkg-config
cargo add protobuf-codegen
cargo install protobuf-codegen // 默认安装到~/.cargo/bin目录中
cargo add grpc-compiler
cargo install grpc-compiler   // 默认安装到~/.cargo/bin目录中
cargo add protobuf
cargo install protobuf // 默认安装到~/.cargo/bin目录中
```

#### 三、在一个 .proto 文件内定义服务

```protobuf
syntax = "proto3";

message HelloRequest{
    string name=1;
}

message HelloResponse{
    string name=1;
}

#定义服务
service HelloService {
    rpc Hello (HelloRequest) returns (HelloResponse);
}
```



#### 四、用 protocol buffer 编译器生成服务器和客户端代码.

示例如下：

```bash
cd $YOURPROJECT
mkdir -p src
protoc --rust_out=./ *.proto
protoc --rust-grpc_out=./ *.proto
```

#### 五、使用 gRPC 的 Rust API 为你的服务实现客户端和服务器.

##### Rust 示例

gRPC 默认使用 protocol buffers，这是 Google 开源的一套成熟的结构数据序列化机制。所以在下方的例子里所看到的，用 proto files 创建 gRPC 服务，用 protocol buffers 消息类型来定义方法参数和返回类型。` .proto`文件如上

##### gRPC服务端

服务端实现服务接口，运行一个 gRPC 服务器来处理客户端调用。gRPC 底层架构会解码传入的请求，执行服务方法，编码服务应答。

 ```rust
//! Rust gRPC服务端实例，明文传输
extern crate protobuf;
extern crate grpc;
extern crate futures;
extern crate futures_cpupool;
extern crate lib;

use std::thread;
use std::env;
use message_grpc::HelloService;
use message::*;
use message_grpc::*;
use grpc::Server;
use lib::*;

struct Hello;

impl HelloService for Hello{
    fn hello(&self, o: ::grpc::RequestOptions, p: message::HelloRequest) -> ::grpc::SingleResponse<message::HelloResponse>{
        let mut resp=message::HelloResponse::new();
        let req=p.get_name();
        let res=format!("response to req:{}",req);
        resp.set_name(res);
        grpc::SingleResponse::completed(resp)
    }
}

fn main() {
    println!("Rust gRPC demo.");
    let mut server=grpc::ServerBuilder::new_plain();
    server.http.set_addr("0.0.0.0:30303");
    server.http.set_cpu_pool_threads(4);
    server.add_service(HelloServiceServer::new_service_def(Hello));
    let _server:Server = server.build().expect("server");

    loop{
        thread::park();
    }
}
 ```

##### gRPC客户端

客户端有一个存根实现了服务端同样的方法。客户端可以在本地存根调用这些方法，用合适的 protocol buffer 消息类型封装这些参数— gRPC 来负责发送请求给服务端并返回服务端 protocol buffer 响应。

 ```rust
//! Rust gRPC客户端实例，明文传输
extern crate protobuf;
extern crate grpc;
extern crate futures;
extern crate futures_cpupool;
extern crate lib;

use message_grpc::HelloService;
use lib::*;

fn main() {
    println!("Rust gRPC client demo.");
    let client = HelloServiceClient::new_plain("0.0.0.0",30303,Default::default()).unwrap();
    let mut req = HelloRequest::new();
    req.set_name("client request.".to_string());

    let resp = client.hello(grpc::RequestOptions::new(),req);
    println!("{:?}",resp.wait());
}
 ```



2、参考文档：

https://rustcc.cn/article?id=21934c4e-60eb-4796-80c2-70c4733032e1

https://rustmagazine.github.io/rust_magazine_2021/chapter_5/

