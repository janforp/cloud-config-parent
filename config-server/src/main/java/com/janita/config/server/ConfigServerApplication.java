package com.janita.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Janita on 2017/6/7- 21:17
 * 该类是:分布式项目配置文件的服务项目
 * 当然该项目也是一个普通的springBoot项目,也可以提供其他的接口服务
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
