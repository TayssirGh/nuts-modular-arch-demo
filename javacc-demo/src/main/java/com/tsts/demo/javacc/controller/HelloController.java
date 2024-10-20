package com.tsts.demo.javacc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloController {
    @GetMapping("/hello")
    public String parseExpression() {

        return "It works \uD83D\uDE01\uD83D\uDE01!!" ;

    }
}
