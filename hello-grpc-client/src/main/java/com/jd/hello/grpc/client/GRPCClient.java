package com.jd.hello.grpc.client;

import com.jd.hello.grpc.api.DateProviderGrpc;
import com.jd.hello.grpc.api.RPCDateRequest;
import com.jd.hello.grpc.api.RPCDateResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GRPCClient {
    private static final String host = "localhost";
    private static final int serverPort = 9999;

    public static void main(String[] args) throws Exception {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(host, serverPort).usePlaintext().build();
        try {
            DateProviderGrpc.DateProviderBlockingStub dateProvider = DateProviderGrpc.newBlockingStub(managedChannel);
            RPCDateRequest rpcDateRequest = RPCDateRequest.newBuilder().setUserName("admin").build();
            RPCDateResponse rpcDateResponse = dateProvider.getDate(rpcDateRequest);
            System.out.println(rpcDateResponse.getServerDate());
        } finally {
            managedChannel.shutdown();
        }
    }
}
