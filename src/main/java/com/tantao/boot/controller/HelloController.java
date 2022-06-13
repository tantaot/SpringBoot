package com.tantao.boot.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("执行");
        return "Hello,SpringBoot!";
    }

}
