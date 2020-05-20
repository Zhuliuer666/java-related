package com.zhuliuer.serviceDiscover;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String name;

    @RequestMapping("/hello")
    public String home() {
        return name + ":" + port;
    }


    @GetMapping("/health")
    public String health(){
        return "OK";
    }
}
