package com.example.vika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {
    @GetMapping("/")
    public String homePage(){
        return "home";
    }
}
