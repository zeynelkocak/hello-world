package com.helloworld.helloworld.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Openshift!";
    }
}
