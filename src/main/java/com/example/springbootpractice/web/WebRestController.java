package com.example.springbootpractice.web;

import org.springframework.web.bind.annotation.*;

@RestController
public class WebRestController {
    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
}