package com.janita.config.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017/6/7- 22:24
 * 该类是:
 */
@RestController
public class ServerController {

    @Value("${server.config}")
    private String config;

    @GetMapping("/server")
    public String server() {

        return config;
    }
}
