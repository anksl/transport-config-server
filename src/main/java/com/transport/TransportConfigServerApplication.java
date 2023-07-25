package com.transport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TransportConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TransportConfigServerApplication.class, args);
    }
}
