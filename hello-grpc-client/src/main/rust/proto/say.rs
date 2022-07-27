/// argument
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct SayRequest {
    /// data type and position of data
    #[prost(string, tag="1")]
    pub name: ::prost::alloc::string::String,
}
/// return value
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct SayResponse {
    /// data type and position of data
    #[prost(string, tag="1")]
    pub message: ::prost::alloc::string::String,
}
/// Generated client implementations.
pub mod say_client {
    #![allow(unused_variables, dead_code, missing_docs, clippy::let_unit_value)]
    use tonic::codegen::*;
    /// service which can be executed
    #[derive(Debug, Clone)]
    pub struct SayClient<T> {
        inner: tonic::client::Grpc<T>,
    }
    impl SayClient<tonic::transport::Channel> {
        /// Attempt to create a new client by connecting to a given endpoint.
        pub async fn connect<D>(dst: D) -> Result<Self, tonic::transport::Error>
        where
            D: std::convert::TryInto<tonic::transport::Endpoint>,
            D::Error: Into<StdError>,
        {
            let conn = tonic::transport::Endpoint::new(dst)?.connect().await?;
            Ok(Self::new(conn))
        }
    }
    impl<T> SayClient<T>
    where
        T: tonic::client::GrpcService<tonic::body::BoxBody>,
        T::Error: Into<StdError>,
        T::ResponseBody: Body<Data = Bytes> + Send + 'static,
        <T::ResponseBody as Body>::Error: Into<StdError> + Send,
    {
        pub fn new(inner: T) -> Self {
            let inner = tonic::client::Grpc::new(inner);
            Self { inner }
        }
        pub fn with_interceptor<F>(
            inner: T,
            interceptor: F,
        ) -> SayClient<InterceptedService<T, F>>
        where
            F: tonic::service::Interceptor,
            T::ResponseBody: Default,
            T: tonic::codegen::Service<
                http::Request<tonic::body::BoxBody>,
                Response = http::Response<
                    <T as tonic::client::GrpcService<tonic::body::BoxBody>>::ResponseBody,
                >,
            >,
            <T as tonic::codegen::Service<
                http::Request<tonic::body::BoxBody>,
            >>::Error: Into<StdError> + Send + Sync,
        {
            SayClient::new(InterceptedService::new(inner, interceptor))
        }
        /// Compress requests with `gzip`.
        ///
        /// This requires the server to support it otherwise it might respond with an
        /// error.
        #[must_use]
        pub fn send_gzip(mut self) -> Self {
            self.inner = self.inner.send_gzip();
            self
        }
        /// Enable decompressing responses with `gzip`.
        #[must_use]
        pub fn accept_gzip(mut self) -> Self {
            self.inner = self.inner.accept_gzip();
            self
        }
        /// function which can be called
        pub async fn send(
            &mut self,
            request: impl tonic::IntoRequest<super::SayRequest>,
        ) -> Result<tonic::Response<super::SayResponse>, tonic::Status> {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static("/say.Say/Send");
            self.inner.unary(request.into_request(), path, codec).await
        }
        pub async fn send_stream(
            &mut self,
            request: impl tonic::IntoRequest<super::SayRequest>,
        ) -> Result<
            tonic::Response<tonic::codec::Streaming<super::SayResponse>>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static("/say.Say/SendStream");
            self.inner.server_streaming(request.into_request(), path, codec).await
        }
        pub async fn receive_stream(
            &mut self,
            request: impl tonic::IntoStreamingRequest<Message = super::SayRequest>,
        ) -> Result<tonic::Response<super::SayResponse>, tonic::Status> {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static("/say.Say/ReceiveStream");
            self.inner
                .client_streaming(request.into_streaming_request(), path, codec)
                .await
        }
        pub async fn bidirectional(
            &mut self,
            request: impl tonic::IntoStreamingRequest<Message = super::SayRequest>,
        ) -> Result<
            tonic::Response<tonic::codec::Streaming<super::SayResponse>>,
            tonic::Status,
        > {
            self.inner
                .ready()
                .await
                .map_err(|e| {
                    tonic::Status::new(
                        tonic::Code::Unknown,
                        format!("Service was not ready: {}", e.into()),
                    )
                })?;
            let codec = tonic::codec::ProstCodec::default();
            let path = http::uri::PathAndQuery::from_static("/say.Say/Bidirectional");
            self.inner.streaming(request.into_streaming_request(), path, codec).await
        }
    }
}
/// Generated server implementations.
pub mod say_server {
    #![allow(unused_variables, dead_code, missing_docs, clippy::let_unit_value)]
    use tonic::codegen::*;
    ///Generated trait containing gRPC methods that should be implemented for use with SayServer.
    #[async_trait]
    pub trait Say: Send + Sync + 'static {
        /// function which can be called
        async fn send(
            &self,
            request: tonic::Request<super::SayRequest>,
        ) -> Result<tonic::Response<super::SayResponse>, tonic::Status>;
        ///Server streaming response type for the SendStream method.
        type SendStreamStream: futures_core::Stream<
                Item = Result<super::SayResponse, tonic::Status>,
            >
            + Send
            + 'static;
        async fn send_stream(
            &self,
            request: tonic::Request<super::SayRequest>,
        ) -> Result<tonic::Response<Self::SendStreamStream>, tonic::Status>;
        async fn receive_stream(
            &self,
            request: tonic::Request<tonic::Streaming<super::SayRequest>>,
        ) -> Result<tonic::Response<super::SayResponse>, tonic::Status>;
        ///Server streaming response type for the Bidirectional method.
        type BidirectionalStream: futures_core::Stream<
                Item = Result<super::SayResponse, tonic::Status>,
            >
            + Send
            + 'static;
        async fn bidirectional(
            &self,
            request: tonic::Request<tonic::Streaming<super::SayRequest>>,
        ) -> Result<tonic::Response<Self::BidirectionalStream>, tonic::Status>;
    }
    /// service which can be executed
    #[derive(Debug)]
    pub struct SayServer<T: Say> {
        inner: _Inner<T>,
        accept_compression_encodings: (),
        send_compression_encodings: (),
    }
    struct _Inner<T>(Arc<T>);
    impl<T: Say> SayServer<T> {
        pub fn new(inner: T) -> Self {
            Self::from_arc(Arc::new(inner))
        }
        pub fn from_arc(inner: Arc<T>) -> Self {
            let inner = _Inner(inner);
            Self {
                inner,
                accept_compression_encodings: Default::default(),
                send_compression_encodings: Default::default(),
            }
        }
        pub fn with_interceptor<F>(
            inner: T,
            interceptor: F,
        ) -> InterceptedService<Self, F>
        where
            F: tonic::service::Interceptor,
        {
            InterceptedService::new(Self::new(inner), interceptor)
        }
    }
    impl<T, B> tonic::codegen::Service<http::Request<B>> for SayServer<T>
    where
        T: Say,
        B: Body + Send + 'static,
        B::Error: Into<StdError> + Send + 'static,
    {
        type Response = http::Response<tonic::body::BoxBody>;
        type Error = std::convert::Infallible;
        type Future = BoxFuture<Self::Response, Self::Error>;
        fn poll_ready(
            &mut self,
            _cx: &mut Context<'_>,
        ) -> Poll<Result<(), Self::Error>> {
            Poll::Ready(Ok(()))
        }
        fn call(&mut self, req: http::Request<B>) -> Self::Future {
            let inner = self.inner.clone();
            match req.uri().path() {
                "/say.Say/Send" => {
                    #[allow(non_camel_case_types)]
                    struct SendSvc<T: Say>(pub Arc<T>);
                    impl<T: Say> tonic::server::UnaryService<super::SayRequest>
                    for SendSvc<T> {
                        type Response = super::SayResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::SayRequest>,
                        ) -> Self::Future {
                            let inner = self.0.clone();
                            let fut = async move { (*inner).send(request).await };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let inner = inner.0;
                        let method = SendSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            );
                        let res = grpc.unary(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/say.Say/SendStream" => {
                    #[allow(non_camel_case_types)]
                    struct SendStreamSvc<T: Say>(pub Arc<T>);
                    impl<T: Say> tonic::server::ServerStreamingService<super::SayRequest>
                    for SendStreamSvc<T> {
                        type Response = super::SayResponse;
                        type ResponseStream = T::SendStreamStream;
                        type Future = BoxFuture<
                            tonic::Response<Self::ResponseStream>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<super::SayRequest>,
                        ) -> Self::Future {
                            let inner = self.0.clone();
                            let fut = async move { (*inner).send_stream(request).await };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let inner = inner.0;
                        let method = SendStreamSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            );
                        let res = grpc.server_streaming(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/say.Say/ReceiveStream" => {
                    #[allow(non_camel_case_types)]
                    struct ReceiveStreamSvc<T: Say>(pub Arc<T>);
                    impl<T: Say> tonic::server::ClientStreamingService<super::SayRequest>
                    for ReceiveStreamSvc<T> {
                        type Response = super::SayResponse;
                        type Future = BoxFuture<
                            tonic::Response<Self::Response>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<tonic::Streaming<super::SayRequest>>,
                        ) -> Self::Future {
                            let inner = self.0.clone();
                            let fut = async move {
                                (*inner).receive_stream(request).await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let inner = inner.0;
                        let method = ReceiveStreamSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            );
                        let res = grpc.client_streaming(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                "/say.Say/Bidirectional" => {
                    #[allow(non_camel_case_types)]
                    struct BidirectionalSvc<T: Say>(pub Arc<T>);
                    impl<T: Say> tonic::server::StreamingService<super::SayRequest>
                    for BidirectionalSvc<T> {
                        type Response = super::SayResponse;
                        type ResponseStream = T::BidirectionalStream;
                        type Future = BoxFuture<
                            tonic::Response<Self::ResponseStream>,
                            tonic::Status,
                        >;
                        fn call(
                            &mut self,
                            request: tonic::Request<tonic::Streaming<super::SayRequest>>,
                        ) -> Self::Future {
                            let inner = self.0.clone();
                            let fut = async move {
                                (*inner).bidirectional(request).await
                            };
                            Box::pin(fut)
                        }
                    }
                    let accept_compression_encodings = self.accept_compression_encodings;
                    let send_compression_encodings = self.send_compression_encodings;
                    let inner = self.inner.clone();
                    let fut = async move {
                        let inner = inner.0;
                        let method = BidirectionalSvc(inner);
                        let codec = tonic::codec::ProstCodec::default();
                        let mut grpc = tonic::server::Grpc::new(codec)
                            .apply_compression_config(
                                accept_compression_encodings,
                                send_compression_encodings,
                            );
                        let res = grpc.streaming(method, req).await;
                        Ok(res)
                    };
                    Box::pin(fut)
                }
                _ => {
                    Box::pin(async move {
                        Ok(
                            http::Response::builder()
                                .status(200)
                                .header("grpc-status", "12")
                                .header("content-type", "application/grpc")
                                .body(empty_body())
                                .unwrap(),
                        )
                    })
                }
            }
        }
    }
    impl<T: Say> Clone for SayServer<T> {
        fn clone(&self) -> Self {
            let inner = self.inner.clone();
            Self {
                inner,
                accept_compression_encodings: self.accept_compression_encodings,
                send_compression_encodings: self.send_compression_encodings,
            }
        }
    }
    impl<T: Say> Clone for _Inner<T> {
        fn clone(&self) -> Self {
            Self(self.0.clone())
        }
    }
    impl<T: std::fmt::Debug> std::fmt::Debug for _Inner<T> {
        fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
            write!(f, "{:?}", self.0)
        }
    }
    impl<T: Say> tonic::transport::NamedService for SayServer<T> {
        const NAME: &'static str = "say.Say";
    }
}
