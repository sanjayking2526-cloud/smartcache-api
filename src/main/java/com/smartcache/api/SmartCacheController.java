package com.smartcache.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SmartCacheController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to SmartCatch API, Machan!";
    }
}