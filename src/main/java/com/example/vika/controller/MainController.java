package com.example.vika.controller;

import com.example.vika.model.Contact;
import com.example.vika.service.ContactImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor

public class MainController {
    private final ContactImpl contactService;

    @GetMapping("/")
    public String homePage(){
        return "home";
    }
    @GetMapping("/contact")
    public String getAllContact(Model model){
        model.addAttribute("contact",contactService.contactList());
        return "contact";
    }
    @PostMapping("/contact")
    public String saveContact(@ModelAttribute Contact contact){
        contactService.saveContact(contact);
        return "home";
    }
}
