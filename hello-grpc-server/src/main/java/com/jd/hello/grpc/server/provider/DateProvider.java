package com.jd.hello.grpc.server.provider;

import com.jd.hello.grpc.api.DateProviderGrpc;
import com.jd.hello.grpc.api.RPCDateRequest;
import com.jd.hello.grpc.api.RPCDateResponse;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: admin
 */
@Slf4j
@GrpcService
public class DateProvider extends DateProviderGrpc.DateProviderImplBase {
    @Override
    public void getDate(RPCDateRequest request, StreamObserver<RPCDateResponse> responseObserver) {
        RPCDateResponse rpcDateResponse = null;
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("今天是" + "yyyy年MM月dd日 E kk点mm分");
        String nowTime = simpleDateFormat.format(now);
        try {
            rpcDateResponse = RPCDateResponse
                    .newBuilder()
                    .setServerDate("Welcome " + request.getUserName() + ", " + nowTime)
                    .build();
        } catch (Exception e) {
            responseObserver.onError(e);
        } finally {
            responseObserver.onNext(rpcDateResponse);
        }
        responseObserver.onCompleted();
    }
}