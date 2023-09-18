package com.spring.jobs.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HelloController {

    @Value("${greeting.dev}")
    private String message;

    @GetMapping
    public String greeting() {
        return message;
    }
}

