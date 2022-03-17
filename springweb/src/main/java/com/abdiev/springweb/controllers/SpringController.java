package com.abdiev.springweb.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @GetMapping("/start")
    public String starter(@RequestParam(required = false,value = "name") String name) {
        return "Hello " + "Dear " + name;
    }
}
