1、生成grpc的go文件
```bash
protoc --go_out=. *.proto
protoc --go-grpc_out=./ *.proto
```

2、使用grpc时，通过protoc工具编译protobuf时，遇到了下面的问题：

```text
protoc-gen-go-grpc: program not found or is not executable
```

上网搜索了很多教程，都不管用，要么说版本不对，要么说无法找到之类的

最后还是通过下面的方法解决了：

需要安装以下gRPC gen插件：

```go
go get -u google.golang.org/protobuf/cmd/protoc-gen-go
go install google.golang.org/protobuf/cmd/protoc-gen-go
go get -u google.golang.org/grpc/cmd/protoc-gen-go-grpc
go install google.golang.org/grpc/cmd/protoc-gen-go-grpc
```