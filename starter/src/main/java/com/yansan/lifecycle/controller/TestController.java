package com.yansan.lifecycle.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class TestController {

    //@RequestMapping("/test/{name}")
    public String test(@PathVariable("name") String name){
        return "hello >>> " + name;
    }
}
