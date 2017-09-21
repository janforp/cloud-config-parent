package com.janita.local.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017/9/21 0021-上午 9:15
 * 该类是：
 */
@RestController
public class LocalServerController {
    @Value("dataUrl")
    private String dataUrl;

    @GetMapping("/dataUrl")
    public String dataUrl() {
        return dataUrl;
    }
}
