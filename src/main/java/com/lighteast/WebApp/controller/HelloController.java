package com.lighteast.WebApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String helloController(){
        return "Hello from Hello Controller";
    }

    @GetMapping("/second")
    public String second(){
        return "Hello from second controller";
    }
}
