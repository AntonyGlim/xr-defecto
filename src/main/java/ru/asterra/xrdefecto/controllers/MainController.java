package ru.asterra.xrdefecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/metering")
    public String metering(){
        return "metering";
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
