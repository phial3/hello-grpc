package org.chainmaker.pb.tee;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.0)",
    comments = "Source: tee/enclave_outcall.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EnclaveOutCallServerGrpc {

  private EnclaveOutCallServerGrpc() {}

  public static final String SERVICE_NAME = "tee.EnclaveOutCallServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.chainmaker.pb.tee.EnclaveOutcall.OutCallGetRequest,
      org.chainmaker.pb.common.ResultOuterClass.ContractResult> getOutCallGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OutCallGet",
      requestType = org.chainmaker.pb.tee.EnclaveOutcall.OutCallGetRequest.class,
      responseType = org.chainmaker.pb.common.ResultOuterClass.ContractResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.chainmaker.pb.tee.EnclaveOutcall.OutCallGetRequest,
      org.chainmaker.pb.common.ResultOuterClass.ContractResult> getOutCallGetMethod() {
    io.grpc.MethodDescriptor<org.chainmaker.pb.tee.EnclaveOutcall.OutCallGetRequest, org.chainmaker.pb.common.ResultOuterClass.ContractResult> getOutCallGetMethod;
    if ((getOutCallGetMethod = EnclaveOutCallServerGrpc.getOutCallGetMethod) == null) {
      synchronized (EnclaveOutCallServerGrpc.class) {
        if ((getOutCallGetMethod = EnclaveOutCallServerGrpc.getOutCallGetMethod) == null) {
          EnclaveOutCallServerGrpc.getOutCallGetMethod = getOutCallGetMethod =
              io.grpc.MethodDescriptor.<org.chainmaker.pb.tee.EnclaveOutcall.OutCallGetRequest, org.chainmaker.pb.common.ResultOuterClass.ContractResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OutCallGet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chainmaker.pb.tee.EnclaveOutcall.OutCallGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chainmaker.pb.common.ResultOuterClass.ContractResult.getDefaultInstance()))
              .setSchemaDescriptor(new EnclaveOutCallServerMethodDescriptorSupplier("OutCallGet"))
              .build();
        }
      }
    }
    return getOutCallGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.chainmaker.pb.tee.EnclaveOutcall.OutCallPutRequest,
      org.chainmaker.pb.common.ResultOuterClass.ContractResult> getOutCallPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OutCallPut",
      requestType = org.chainmaker.pb.tee.EnclaveOutcall.OutCallPutRequest.class,
      responseType = org.chainmaker.pb.common.ResultOuterClass.ContractResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.chainmaker.pb.tee.EnclaveOutcall.OutCallPutRequest,
      org.chainmaker.pb.common.ResultOuterClass.ContractResult> getOutCallPutMethod() {
    io.grpc.MethodDescriptor<org.chainmaker.pb.tee.EnclaveOutcall.OutCallPutRequest, org.chainmaker.pb.common.ResultOuterClass.ContractResult> getOutCallPutMethod;
    if ((getOutCallPutMethod = EnclaveOutCallServerGrpc.getOutCallPutMethod) == null) {
      synchronized (EnclaveOutCallServerGrpc.class) {
        if ((getOutCallPutMethod = EnclaveOutCallServerGrpc.getOutCallPutMethod) == null) {
          EnclaveOutCallServerGrpc.getOutCallPutMethod = getOutCallPutMethod =
              io.grpc.MethodDescriptor.<org.chainmaker.pb.tee.EnclaveOutcall.OutCallPutRequest, org.chainmaker.pb.common.ResultOuterClass.ContractResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OutCallPut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chainmaker.pb.tee.EnclaveOutcall.OutCallPutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chainmaker.pb.common.ResultOuterClass.ContractResult.getDefaultInstance()))
              .setSchemaDescriptor(new EnclaveOutCallServerMethodDescriptorSupplier("OutCallPut"))
              .build();
        }
      }
    }
    return getOutCallPutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnclaveOutCallServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnclaveOutCallServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnclaveOutCallServerStub>() {
        @java.lang.Override
        public EnclaveOutCallServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnclaveOutCallServerStub(channel, callOptions);
        }
      };
    return EnclaveOutCallServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnclaveOutCallServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnclaveOutCallServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnclaveOutCallServerBlockingStub>() {
        @java.lang.Override
        public EnclaveOutCallServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnclaveOutCallServerBlockingStub(channel, callOptions);
        }
      };
    return EnclaveOutCallServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnclaveOutCallServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnclaveOutCallServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnclaveOutCallServerFutureStub>() {
        @java.lang.Override
        public EnclaveOutCallServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnclaveOutCallServerFutureStub(channel, callOptions);
        }
      };
    return EnclaveOutCallServerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EnclaveOutCallServerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Enclave fetch data from blockchain
     * </pre>
     */
    public void outCallGet(org.chainmaker.pb.tee.EnclaveOutcall.OutCallGetRequest request,
        io.grpc.stub.StreamObserver<org.chainmaker.pb.common.ResultOuterClass.ContractResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOutCallGetMethod(), responseObserver);
    }

    /**
     */
    public void outCallPut(org.chainmaker.pb.tee.EnclaveOutcall.OutCallPutRequest request,
        io.grpc.stub.StreamObserver<org.chainmaker.pb.common.ResultOuterClass.ContractResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOutCallPutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOutCallGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.chainmaker.pb.tee.EnclaveOutcall.OutCallGetRequest,
                org.chainmaker.pb.common.ResultOuterClass.ContractResult>(
                  this, METHODID_OUT_CALL_GET)))
          .addMethod(
            getOutCallPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.chainmaker.pb.tee.EnclaveOutcall.OutCallPutRequest,
                org.chainmaker.pb.common.ResultOuterClass.ContractResult>(
                  this, METHODID_OUT_CALL_PUT)))
          .build();
    }
  }

  /**
   */
  public static final class EnclaveOutCallServerStub extends io.grpc.stub.AbstractAsyncStub<EnclaveOutCallServerStub> {
    private EnclaveOutCallServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnclaveOutCallServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnclaveOutCallServerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enclave fetch data from blockchain
     * </pre>
     */
    public void outCallGet(org.chainmaker.pb.tee.EnclaveOutcall.OutCallGetRequest request,
        io.grpc.stub.StreamObserver<org.chainmaker.pb.common.ResultOuterClass.ContractResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOutCallGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void outCallPut(org.chainmaker.pb.tee.EnclaveOutcall.OutCallPutRequest request,
        io.grpc.stub.StreamObserver<org.chainmaker.pb.common.ResultOuterClass.ContractResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOutCallPutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EnclaveOutCallServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<EnclaveOutCallServerBlockingStub> {
    private EnclaveOutCallServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnclaveOutCallServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnclaveOutCallServerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enclave fetch data from blockchain
     * </pre>
     */
    public org.chainmaker.pb.common.ResultOuterClass.ContractResult outCallGet(org.chainmaker.pb.tee.EnclaveOutcall.OutCallGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOutCallGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.chainmaker.pb.common.ResultOuterClass.ContractResult outCallPut(org.chainmaker.pb.tee.EnclaveOutcall.OutCallPutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOutCallPutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EnclaveOutCallServerFutureStub extends io.grpc.stub.AbstractFutureStub<EnclaveOutCallServerFutureStub> {
    private EnclaveOutCallServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnclaveOutCallServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnclaveOutCallServerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Enclave fetch data from blockchain
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.chainmaker.pb.common.ResultOuterClass.ContractResult> outCallGet(
        org.chainmaker.pb.tee.EnclaveOutcall.OutCallGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOutCallGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.chainmaker.pb.common.ResultOuterClass.ContractResult> outCallPut(
        org.chainmaker.pb.tee.EnclaveOutcall.OutCallPutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOutCallPutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OUT_CALL_GET = 0;
  private static final int METHODID_OUT_CALL_PUT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EnclaveOutCallServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EnclaveOutCallServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OUT_CALL_GET:
          serviceImpl.outCallGet((org.chainmaker.pb.tee.EnclaveOutcall.OutCallGetRequest) request,
              (io.grpc.stub.StreamObserver<org.chainmaker.pb.common.ResultOuterClass.ContractResult>) responseObserver);
          break;
        case METHODID_OUT_CALL_PUT:
          serviceImpl.outCallPut((org.chainmaker.pb.tee.EnclaveOutcall.OutCallPutRequest) request,
              (io.grpc.stub.StreamObserver<org.chainmaker.pb.common.ResultOuterClass.ContractResult>) responseObserver);
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

  private static abstract class EnclaveOutCallServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EnclaveOutCallServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.chainmaker.pb.tee.EnclaveOutcall.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EnclaveOutCallServer");
    }
  }

  private static final class EnclaveOutCallServerFileDescriptorSupplier
      extends EnclaveOutCallServerBaseDescriptorSupplier {
    EnclaveOutCallServerFileDescriptorSupplier() {}
  }

  private static final class EnclaveOutCallServerMethodDescriptorSupplier
      extends EnclaveOutCallServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EnclaveOutCallServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (EnclaveOutCallServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EnclaveOutCallServerFileDescriptorSupplier())
              .addMethod(getOutCallGetMethod())
              .addMethod(getOutCallPutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
