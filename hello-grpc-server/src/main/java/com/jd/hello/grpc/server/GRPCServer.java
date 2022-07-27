package com.jd.hello.grpc.server;

import com.jd.hello.grpc.server.provider.DateProvider;
import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
 * @author: admin
 * @create: 2019/07/07
 */
public class GRPCServer {
    private static final int port = 9999;

    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.
                forPort(port)
                .addService(new DateProvider())
                .build().start();
        System.out.println("grpc服务端启动成功, 端口=" + port);
        server.awaitTermination();
    }
}
