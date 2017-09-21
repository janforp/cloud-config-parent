package com.janita.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Janita on 2017/9/21 0021-上午 9:44
 * 该类是：
 */
@SpringBootApplication
@EnableConfigServer
public class LocalClientTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(LocalClientTwoApplication.class, args);
    }
}
