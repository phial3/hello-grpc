package com.jd.hello.grpc.server.provider;

import com.jd.hello.grpc.api.UserIdRequest;
import com.jd.hello.grpc.api.UserProviderGrpc;
import com.jd.hello.grpc.api.UserVoReplay;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * Grpc服务暴露
 *
 * @datetime 2018/11/24 14:36
 */
@Slf4j
@GrpcService
public class UserProvider extends UserProviderGrpc.UserProviderImplBase {

    @Override
    public void getByUserId(UserIdRequest request, StreamObserver<UserVoReplay> responseObserver) {
        // super.getByUserId(request, responseObserver);

        // 获取请求数据
        long userId = request.getId();
        log.debug("grpc request: userId=" + userId);

        // 构造返回数据
        UserVoReplay.Builder userVoReplayBuild = UserVoReplay.newBuilder();
        userVoReplayBuild.setId(userId);
        userVoReplayBuild.setUsername("this is demo test name.");
        UserVoReplay userVoReplay = userVoReplayBuild.build();

        // 做出响应
        responseObserver.onNext(userVoReplay);
        responseObserver.onCompleted();
    }
}
