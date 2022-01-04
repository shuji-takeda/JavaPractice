package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class SayHello {

    @RequestMapping("greet")
    public String SayHello(){
        return "hello Shuji";
    }
}
