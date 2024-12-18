package com.cabinetmedical.cabimed.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //HTTP GET Request
    @GetMapping("/hello-achraf")
    public String hello(){
        return "hello achraf";
    }
}
