package com.example.demo.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class TestRestController {

    @Value("${test.property.1:t}")
    String test;

    @GetMapping("/get")
    public String getMethod(){
        return "app rest connected new build v 3 : " + test;
    }

}
