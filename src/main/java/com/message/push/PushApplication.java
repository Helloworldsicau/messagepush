package com.message.push;

import com.message.push.server.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PushApplication {

    public static void main(String[] args) {
        SpringApplication.run(PushApplication.class, args);

        try {
            new NettyServer(12345).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
