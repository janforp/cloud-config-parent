package com.janita.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017/6/7- 22:17
 * 该类是:
 */
@RestController
public class TestController {

    @Value("${client.one}")
    private String config;

    @GetMapping("/test")
    public String test() {

        return config;
    }
}
