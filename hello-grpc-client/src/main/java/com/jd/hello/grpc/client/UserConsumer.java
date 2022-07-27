package com.jd.hello.grpc.client;

import com.jd.hello.grpc.api.*;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class UserConsumer {

    @GrpcClient("hello-grpc-server")
    private UserProviderGrpc.UserProviderBlockingStub userProvider;

    @PostConstruct
    public void init() {
        UserVoReplay userReply = userProvider.getByUserId(UserIdRequest.newBuilder().build());
        log.info("UserConsumer result is {}", userReply);
    }
}
