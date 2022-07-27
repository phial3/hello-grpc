use hello_grpc_rust::hello_world::greeter_client::GreeterClient;
use hello_grpc_rust::hello_world::{HelloReply, HelloRequest};
use tonic::Response;

#[tokio::main]
async fn main() -> Result<(), Box<dyn std::error::Error>> {
    let mut client = GreeterClient::connect("https://[::1]:50051").await?;

    let request = tonic::Request::new(HelloRequest {
        name: "Mr. Tonic".into(),
    });
    let response: Response<HelloReply> = client.say_hello(request).await?;

    println!("RESPONSE={:?}", response);

    Ok(())
}
