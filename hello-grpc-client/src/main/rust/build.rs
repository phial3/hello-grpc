use std::{env, path::PathBuf};

fn main() -> Result<(), Box<dyn std::error::Error>> {
    let helloworld_proto_file = "./proto/helloworld.proto";
    let say_proto_file = "./proto/say.proto";
    let out_dir = PathBuf::from(env::var("OUT_DIR").unwrap());

    tonic_build::configure()
        // 编译服务端
        .build_server(true)
        .build_client(true)
        .file_descriptor_set_path(out_dir.join("greeter_descriptor.bin"))
        .out_dir("./proto")
        .compile(&[helloworld_proto_file, say_proto_file], &["./proto"])
        .unwrap_or_else(|e| panic!("protobuf compile error: {}", e));

    Ok(())
}
