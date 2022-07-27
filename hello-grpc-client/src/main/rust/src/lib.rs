pub mod hello_world {
    include!("../proto/helloworld.rs");

    // Add this
    pub(crate) const FILE_DESCRIPTOR_SET: &[u8] =
        tonic::include_file_descriptor_set!("greeter_descriptor");
}
