package com.smartcache.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartcacheApiApplication {

    public static void main(String[] args) {
        
        System.setProperty("spring.autoconfigure.exclude", "org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration,org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration,org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration");
        
        SpringApplication.run(SmartcacheApiApplication.class, args);
    }
}
