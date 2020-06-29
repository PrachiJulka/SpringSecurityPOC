package com.ttn.springSecurityPOC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return ("WELCOME TO CONTACT BOOK");
    }

    @GetMapping("/user")
    public String userHome(){
        return ("WELCOME TO CONTACT BOOK USER");
    }

    @GetMapping("/admin")
    public String adminHome(){
        return ("WELCOME TO CONTACT BOOK ADMIN");
    }

}