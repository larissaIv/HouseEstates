package com.example.houseEstates.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home"; }

    @GetMapping("/menu")
    public String menu(){
        return "menu";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

}
