package com.example.vika.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor

public class AdminController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }



}
