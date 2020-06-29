package com.ttn.springSecurityPOC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return ("WELCOME TO CONTACT BOOK");
    }

    @GetMapping("/user")
    public String user(){
        return ("WELCOME TO CONTACT BOOK USER");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("WELCOME TO CONTACT BOOK ADMIN");
    }

}
