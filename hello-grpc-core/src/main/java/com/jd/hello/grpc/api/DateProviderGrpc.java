package com.jd.hello.grpc.api;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * 服务接口定义，服务端和客户端都要遵守该接口进行通信
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: date_service.proto")
public final class DateProviderGrpc {

  private DateProviderGrpc() {}

  public static final String SERVICE_NAME = "com.jd.hello.grpc.api.DateProvider";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.jd.hello.grpc.api.RPCDateRequest,
      com.jd.hello.grpc.api.RPCDateResponse> METHOD_GET_DATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.jd.hello.grpc.api.DateProvider", "getDate"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.jd.hello.grpc.api.RPCDateRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.jd.hello.grpc.api.RPCDateResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DateProviderStub newStub(io.grpc.Channel channel) {
    return new DateProviderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DateProviderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DateProviderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static DateProviderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DateProviderFutureStub(channel);
  }

  /**
   * <pre>
   * 服务接口定义，服务端和客户端都要遵守该接口进行通信
   * </pre>
   */
  public static abstract class DateProviderImplBase implements io.grpc.BindableService {

    /**
     */
    public void getDate(com.jd.hello.grpc.api.RPCDateRequest request,
        io.grpc.stub.StreamObserver<com.jd.hello.grpc.api.RPCDateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DATE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_DATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.jd.hello.grpc.api.RPCDateRequest,
                com.jd.hello.grpc.api.RPCDateResponse>(
                  this, METHODID_GET_DATE)))
          .build();
    }
  }

  /**
   * <pre>
   * 服务接口定义，服务端和客户端都要遵守该接口进行通信
   * </pre>
   */
  public static final class DateProviderStub extends io.grpc.stub.AbstractStub<DateProviderStub> {
    private DateProviderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DateProviderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DateProviderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DateProviderStub(channel, callOptions);
    }

    /**
     */
    public void getDate(com.jd.hello.grpc.api.RPCDateRequest request,
        io.grpc.stub.StreamObserver<com.jd.hello.grpc.api.RPCDateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DATE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 服务接口定义，服务端和客户端都要遵守该接口进行通信
   * </pre>
   */
  public static final class DateProviderBlockingStub extends io.grpc.stub.AbstractStub<DateProviderBlockingStub> {
    private DateProviderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DateProviderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DateProviderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DateProviderBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.jd.hello.grpc.api.RPCDateResponse getDate(com.jd.hello.grpc.api.RPCDateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DATE, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 服务接口定义，服务端和客户端都要遵守该接口进行通信
   * </pre>
   */
  public static final class DateProviderFutureStub extends io.grpc.stub.AbstractStub<DateProviderFutureStub> {
    private DateProviderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DateProviderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DateProviderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DateProviderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jd.hello.grpc.api.RPCDateResponse> getDate(
        com.jd.hello.grpc.api.RPCDateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DATE, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DateProviderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DateProviderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DATE:
          serviceImpl.getDate((com.jd.hello.grpc.api.RPCDateRequest) request,
              (io.grpc.stub.StreamObserver<com.jd.hello.grpc.api.RPCDateResponse>) responseObserver);
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

  private static final class DateProviderDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jd.hello.grpc.api.DateProviderApi.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DateProviderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DateProviderDescriptorSupplier())
              .addMethod(METHOD_GET_DATE)
              .build();
        }
      }
    }
    return result;
  }
}
