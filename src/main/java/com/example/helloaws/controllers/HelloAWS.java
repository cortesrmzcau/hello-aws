package com.example.helloaws.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAWS {

    @GetMapping(value = "/")
    public String helloAWS() {
        return "Hello AWS";
    }
}
