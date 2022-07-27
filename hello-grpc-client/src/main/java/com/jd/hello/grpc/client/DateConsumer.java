package com.jd.hello.grpc.client;

import com.jd.hello.grpc.api.DateProviderGrpc;
import com.jd.hello.grpc.api.RPCDateRequest;
import com.jd.hello.grpc.api.RPCDateResponse;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class DateConsumer {

    @GrpcClient("hello-grpc-server")
    private DateProviderGrpc.DateProviderBlockingStub rpcDateService;

    @PostConstruct
    public void init() {
        RPCDateResponse resp = rpcDateService.getDate(RPCDateRequest.newBuilder().build());
        log.info("DateConsumer result is {}", resp.toString());
    }
}
