package ru.asterra.xrdefecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/print")
    public String print(){
        return "print";
    }

    @GetMapping("/archive")
    public String archive(){
        return "archive";
    }

}
