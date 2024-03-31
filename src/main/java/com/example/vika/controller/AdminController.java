package com.example.vika.controller;

import com.example.vika.model.UserEntity;
import com.example.vika.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor

public class AdminController {
    private final UserRepository userRepository;
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/registration")
    public String registration(Model model){
        model.addAttribute("UserEntity",new UserEntity());
        return "registration";
    }


    @PostMapping("/registration")
    public String saveUser(@ModelAttribute ("userEntity") UserEntity userEntity ,Model model){
      userRepository.save(userEntity);

        return "redirect:/login";
    }

}
