package com.janita.local;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Janita on 2017/9/20 0020-下午 2:26
 * 该类是：
 */
@SpringBootApplication
@EnableConfigServer
public class LocalServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LocalServerApplication.class, args);
    }
}
