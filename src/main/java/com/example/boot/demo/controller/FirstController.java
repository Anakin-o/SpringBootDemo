package com.example.boot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }
}
