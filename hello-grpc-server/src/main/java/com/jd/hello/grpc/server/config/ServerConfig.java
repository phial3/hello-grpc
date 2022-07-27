package com.jd.hello.grpc.server.config;

import net.devh.boot.grpc.server.security.authentication.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

//@Configuration
public class ServerConfig {
    // 基础认证
//    @Bean
//    AuthenticationManager authenticationManager() {
//        final List<AuthenticationProvider> providers = new ArrayList<>();
//        //providers.add(...); // Possibly DaoAuthenticationProvider
//        return new ProviderManager(providers);
//    }

//    @Bean
//    GrpcAuthenticationReader authenticationReader() {
//        final List<GrpcAuthenticationReader> readers = new ArrayList<>();
//        readers.add(new BasicGrpcAuthenticationReader());
//        return new CompositeGrpcAuthenticationReader(readers);
//    }

    // 证书认证
//    @Bean
//    AuthenticationManager authenticationManager() {
//        final List<AuthenticationProvider> providers = new ArrayList<>();
//        providers.add(new X509CertificateAuthenticationProvider(userDetailsService()));
//        return new ProviderManager(providers);
//    }

//    @Bean
//    GrpcAuthenticationReader authenticationReader() {
//        final List<GrpcAuthenticationReader> readers = new ArrayList<>();
//        readers.add(new SSLContextGrpcAuthenticationReader());
//        return new CompositeGrpcAuthenticationReader(readers);
//    }

}
