package org.chainmaker.pb.tee;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.0)",
    comments = "Source: tee/enclave_server.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EnclaveServerGrpc {

  private EnclaveServerGrpc() {}

  public static final String SERVICE_NAME = "tee.EnclaveServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveRequest,
      org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveResponse> getInitEnclaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitEnclave",
      requestType = org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveRequest.class,
      responseType = org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveRequest,
      org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveResponse> getInitEnclaveMethod() {
    io.grpc.MethodDescriptor<org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveRequest, org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveResponse> getInitEnclaveMethod;
    if ((getInitEnclaveMethod = EnclaveServerGrpc.getInitEnclaveMethod) == null) {
      synchronized (EnclaveServerGrpc.class) {
        if ((getInitEnclaveMethod = EnclaveServerGrpc.getInitEnclaveMethod) == null) {
          EnclaveServerGrpc.getInitEnclaveMethod = getInitEnclaveMethod =
              io.grpc.MethodDescriptor.<org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveRequest, org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitEnclave"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnclaveServerMethodDescriptorSupplier("InitEnclave"))
              .build();
        }
      }
    }
    return getInitEnclaveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.chainmaker.pb.common.Request.TxRequest,
      org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse> getDeployContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeployContract",
      requestType = org.chainmaker.pb.common.Request.TxRequest.class,
      responseType = org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.chainmaker.pb.common.Request.TxRequest,
      org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse> getDeployContractMethod() {
    io.grpc.MethodDescriptor<org.chainmaker.pb.common.Request.TxRequest, org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse> getDeployContractMethod;
    if ((getDeployContractMethod = EnclaveServerGrpc.getDeployContractMethod) == null) {
      synchronized (EnclaveServerGrpc.class) {
        if ((getDeployContractMethod = EnclaveServerGrpc.getDeployContractMethod) == null) {
          EnclaveServerGrpc.getDeployContractMethod = getDeployContractMethod =
              io.grpc.MethodDescriptor.<org.chainmaker.pb.common.Request.TxRequest, org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeployContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chainmaker.pb.common.Request.TxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnclaveServerMethodDescriptorSupplier("DeployContract"))
              .build();
        }
      }
    }
    return getDeployContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.chainmaker.pb.common.Request.TxRequest,
      org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse> getInvokeContractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InvokeContract",
      requestType = org.chainmaker.pb.common.Request.TxRequest.class,
      responseType = org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.chainmaker.pb.common.Request.TxRequest,
      org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse> getInvokeContractMethod() {
    io.grpc.MethodDescriptor<org.chainmaker.pb.common.Request.TxRequest, org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse> getInvokeContractMethod;
    if ((getInvokeContractMethod = EnclaveServerGrpc.getInvokeContractMethod) == null) {
      synchronized (EnclaveServerGrpc.class) {
        if ((getInvokeContractMethod = EnclaveServerGrpc.getInvokeContractMethod) == null) {
          EnclaveServerGrpc.getInvokeContractMethod = getInvokeContractMethod =
              io.grpc.MethodDescriptor.<org.chainmaker.pb.common.Request.TxRequest, org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InvokeContract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chainmaker.pb.common.Request.TxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnclaveServerMethodDescriptorSupplier("InvokeContract"))
              .build();
        }
      }
    }
    return getInvokeContractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationRequest,
      org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationResponse> getRemoteAttestationProveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoteAttestationProve",
      requestType = org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationRequest.class,
      responseType = org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationRequest,
      org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationResponse> getRemoteAttestationProveMethod() {
    io.grpc.MethodDescriptor<org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationRequest, org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationResponse> getRemoteAttestationProveMethod;
    if ((getRemoteAttestationProveMethod = EnclaveServerGrpc.getRemoteAttestationProveMethod) == null) {
      synchronized (EnclaveServerGrpc.class) {
        if ((getRemoteAttestationProveMethod = EnclaveServerGrpc.getRemoteAttestationProveMethod) == null) {
          EnclaveServerGrpc.getRemoteAttestationProveMethod = getRemoteAttestationProveMethod =
              io.grpc.MethodDescriptor.<org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationRequest, org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoteAttestationProve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnclaveServerMethodDescriptorSupplier("RemoteAttestationProve"))
              .build();
        }
      }
    }
    return getRemoteAttestationProveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnclaveServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnclaveServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnclaveServerStub>() {
        @java.lang.Override
        public EnclaveServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnclaveServerStub(channel, callOptions);
        }
      };
    return EnclaveServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnclaveServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnclaveServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnclaveServerBlockingStub>() {
        @java.lang.Override
        public EnclaveServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnclaveServerBlockingStub(channel, callOptions);
        }
      };
    return EnclaveServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnclaveServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnclaveServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnclaveServerFutureStub>() {
        @java.lang.Override
        public EnclaveServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnclaveServerFutureStub(channel, callOptions);
        }
      };
    return EnclaveServerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EnclaveServerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Init Enclave (optional):
     * 1. Generate and return report.
     * 2. Generate private key and return public key (RSA &amp; ECC).
     * 3. Generate and return csr. (Cert will be put into trusted files later)
     * </pre>
     */
    public void initEnclave(org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveRequest request,
        io.grpc.stub.StreamObserver<org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitEnclaveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deploy contract.
     * </pre>
     */
    public void deployContract(org.chainmaker.pb.common.Request.TxRequest request,
        io.grpc.stub.StreamObserver<org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeployContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * Invoke contract.
     * </pre>
     */
    public void invokeContract(org.chainmaker.pb.common.Request.TxRequest request,
        io.grpc.stub.StreamObserver<org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInvokeContractMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remote attestation prove
     * </pre>
     */
    public void remoteAttestationProve(org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationRequest request,
        io.grpc.stub.StreamObserver<org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoteAttestationProveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitEnclaveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveRequest,
                org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveResponse>(
                  this, METHODID_INIT_ENCLAVE)))
          .addMethod(
            getDeployContractMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.chainmaker.pb.common.Request.TxRequest,
                org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse>(
                  this, METHODID_DEPLOY_CONTRACT)))
          .addMethod(
            getInvokeContractMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.chainmaker.pb.common.Request.TxRequest,
                org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse>(
                  this, METHODID_INVOKE_CONTRACT)))
          .addMethod(
            getRemoteAttestationProveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationRequest,
                org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationResponse>(
                  this, METHODID_REMOTE_ATTESTATION_PROVE)))
          .build();
    }
  }

  /**
   */
  public static final class EnclaveServerStub extends io.grpc.stub.AbstractAsyncStub<EnclaveServerStub> {
    private EnclaveServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnclaveServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnclaveServerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Init Enclave (optional):
     * 1. Generate and return report.
     * 2. Generate private key and return public key (RSA &amp; ECC).
     * 3. Generate and return csr. (Cert will be put into trusted files later)
     * </pre>
     */
    public void initEnclave(org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveRequest request,
        io.grpc.stub.StreamObserver<org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitEnclaveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deploy contract.
     * </pre>
     */
    public void deployContract(org.chainmaker.pb.common.Request.TxRequest request,
        io.grpc.stub.StreamObserver<org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeployContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Invoke contract.
     * </pre>
     */
    public void invokeContract(org.chainmaker.pb.common.Request.TxRequest request,
        io.grpc.stub.StreamObserver<org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInvokeContractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remote attestation prove
     * </pre>
     */
    public void remoteAttestationProve(org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationRequest request,
        io.grpc.stub.StreamObserver<org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoteAttestationProveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EnclaveServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<EnclaveServerBlockingStub> {
    private EnclaveServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnclaveServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnclaveServerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Init Enclave (optional):
     * 1. Generate and return report.
     * 2. Generate private key and return public key (RSA &amp; ECC).
     * 3. Generate and return csr. (Cert will be put into trusted files later)
     * </pre>
     */
    public org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveResponse initEnclave(org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitEnclaveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deploy contract.
     * </pre>
     */
    public org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse deployContract(org.chainmaker.pb.common.Request.TxRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeployContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Invoke contract.
     * </pre>
     */
    public org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse invokeContract(org.chainmaker.pb.common.Request.TxRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInvokeContractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remote attestation prove
     * </pre>
     */
    public org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationResponse remoteAttestationProve(org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoteAttestationProveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EnclaveServerFutureStub extends io.grpc.stub.AbstractFutureStub<EnclaveServerFutureStub> {
    private EnclaveServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnclaveServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnclaveServerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Init Enclave (optional):
     * 1. Generate and return report.
     * 2. Generate private key and return public key (RSA &amp; ECC).
     * 3. Generate and return csr. (Cert will be put into trusted files later)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveResponse> initEnclave(
        org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitEnclaveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deploy contract.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse> deployContract(
        org.chainmaker.pb.common.Request.TxRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeployContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Invoke contract.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse> invokeContract(
        org.chainmaker.pb.common.Request.TxRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInvokeContractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remote attestation prove
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationResponse> remoteAttestationProve(
        org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoteAttestationProveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INIT_ENCLAVE = 0;
  private static final int METHODID_DEPLOY_CONTRACT = 1;
  private static final int METHODID_INVOKE_CONTRACT = 2;
  private static final int METHODID_REMOTE_ATTESTATION_PROVE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EnclaveServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EnclaveServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INIT_ENCLAVE:
          serviceImpl.initEnclave((org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveRequest) request,
              (io.grpc.stub.StreamObserver<org.chainmaker.pb.tee.EnclaveServerOuterClass.InitEnclaveResponse>) responseObserver);
          break;
        case METHODID_DEPLOY_CONTRACT:
          serviceImpl.deployContract((org.chainmaker.pb.common.Request.TxRequest) request,
              (io.grpc.stub.StreamObserver<org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse>) responseObserver);
          break;
        case METHODID_INVOKE_CONTRACT:
          serviceImpl.invokeContract((org.chainmaker.pb.common.Request.TxRequest) request,
              (io.grpc.stub.StreamObserver<org.chainmaker.pb.tee.EnclaveServerOuterClass.EnclaveResponse>) responseObserver);
          break;
        case METHODID_REMOTE_ATTESTATION_PROVE:
          serviceImpl.remoteAttestationProve((org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationRequest) request,
              (io.grpc.stub.StreamObserver<org.chainmaker.pb.tee.EnclaveServerOuterClass.RemoteAttestationResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EnclaveServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EnclaveServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.chainmaker.pb.tee.EnclaveServerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EnclaveServer");
    }
  }

  private static final class EnclaveServerFileDescriptorSupplier
      extends EnclaveServerBaseDescriptorSupplier {
    EnclaveServerFileDescriptorSupplier() {}
  }

  private static final class EnclaveServerMethodDescriptorSupplier
      extends EnclaveServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EnclaveServerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EnclaveServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EnclaveServerFileDescriptorSupplier())
              .addMethod(getInitEnclaveMethod())
              .addMethod(getDeployContractMethod())
              .addMethod(getInvokeContractMethod())
              .addMethod(getRemoteAttestationProveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
