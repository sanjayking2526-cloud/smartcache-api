package com.smartcache.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(excludeName = {"org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration"})
public class SmartcacheApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartcacheApiApplication.class, args);
    }
}
