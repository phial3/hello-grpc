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
 * 定义对外暴露的服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: user_provider.proto")
public final class UserProviderGrpc {

  private UserProviderGrpc() {}

  public static final String SERVICE_NAME = "com.jd.hello.grpc.api.UserProvider";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.jd.hello.grpc.api.UserIdRequest,
      com.jd.hello.grpc.api.UserVoReplay> METHOD_GET_BY_USER_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.jd.hello.grpc.api.UserProvider", "getByUserId"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.jd.hello.grpc.api.UserIdRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.jd.hello.grpc.api.UserVoReplay.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserProviderStub newStub(io.grpc.Channel channel) {
    return new UserProviderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserProviderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserProviderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static UserProviderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserProviderFutureStub(channel);
  }

  /**
   * <pre>
   * 定义对外暴露的服务
   * </pre>
   */
  public static abstract class UserProviderImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 根据用户id获取用户信息的服务(具体服务/函数)
     * </pre>
     */
    public void getByUserId(com.jd.hello.grpc.api.UserIdRequest request,
        io.grpc.stub.StreamObserver<com.jd.hello.grpc.api.UserVoReplay> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BY_USER_ID, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_BY_USER_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.jd.hello.grpc.api.UserIdRequest,
                com.jd.hello.grpc.api.UserVoReplay>(
                  this, METHODID_GET_BY_USER_ID)))
          .build();
    }
  }

  /**
   * <pre>
   * 定义对外暴露的服务
   * </pre>
   */
  public static final class UserProviderStub extends io.grpc.stub.AbstractStub<UserProviderStub> {
    private UserProviderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserProviderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserProviderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserProviderStub(channel, callOptions);
    }

    /**
     * <pre>
     * 根据用户id获取用户信息的服务(具体服务/函数)
     * </pre>
     */
    public void getByUserId(com.jd.hello.grpc.api.UserIdRequest request,
        io.grpc.stub.StreamObserver<com.jd.hello.grpc.api.UserVoReplay> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BY_USER_ID, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 定义对外暴露的服务
   * </pre>
   */
  public static final class UserProviderBlockingStub extends io.grpc.stub.AbstractStub<UserProviderBlockingStub> {
    private UserProviderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserProviderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserProviderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserProviderBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 根据用户id获取用户信息的服务(具体服务/函数)
     * </pre>
     */
    public com.jd.hello.grpc.api.UserVoReplay getByUserId(com.jd.hello.grpc.api.UserIdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BY_USER_ID, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 定义对外暴露的服务
   * </pre>
   */
  public static final class UserProviderFutureStub extends io.grpc.stub.AbstractStub<UserProviderFutureStub> {
    private UserProviderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserProviderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserProviderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserProviderFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 根据用户id获取用户信息的服务(具体服务/函数)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.jd.hello.grpc.api.UserVoReplay> getByUserId(
        com.jd.hello.grpc.api.UserIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BY_USER_ID, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BY_USER_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserProviderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserProviderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BY_USER_ID:
          serviceImpl.getByUserId((com.jd.hello.grpc.api.UserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.jd.hello.grpc.api.UserVoReplay>) responseObserver);
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

  private static final class UserProviderDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.jd.hello.grpc.api.UserProviderApi.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserProviderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserProviderDescriptorSupplier())
              .addMethod(METHOD_GET_BY_USER_ID)
              .build();
        }
      }
    }
    return result;
  }
}
