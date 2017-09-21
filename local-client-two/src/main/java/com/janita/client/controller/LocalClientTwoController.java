package com.janita.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017/9/21 0021-上午 9:47
 * 该类是：
 */
@RestController
public class LocalClientTwoController {

    @Value("localClientTwo")
    private String localClientTwo;
    @Value("commonProperty")
    private String commonProperty;

    @GetMapping("/localClientTwo")
    private String localClientTwo() {
        return localClientTwo;
    }

    @GetMapping("/common")
    private String commonProperty() {
        return commonProperty;
    }
}
