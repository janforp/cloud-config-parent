package com.janita.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017/6/7- 22:27
 * 该类是:
 */
@RestController
public class ClientTwoController {


    @Value("${client.two}")
    private String clientTwo;

    @GetMapping("/two")
    public String clientTwo() {
        return clientTwo;
    }
}
