package com.tsts.demo.module.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module1")
public class ModuleControllerWS {
    @GetMapping
    public String parseExpression() {

        return "Hello from module 1 \uD83D\uDE01\uD83D\uDE01!!" ;

    }
}
