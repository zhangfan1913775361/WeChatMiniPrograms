package com.imooc.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    public String hello(){
        return "hello springboot";
    }
}
