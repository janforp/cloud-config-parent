package com.janita.config.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Janita on 2017/6/7- 22:13
 * 该类是:
 */
@Configuration
public class CustomBeanConfig {

    @Value("url")
    private String  url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        System.out.println("\n****************** " + url);
        this.url = url;
    }
}
