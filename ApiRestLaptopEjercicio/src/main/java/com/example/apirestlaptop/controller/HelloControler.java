package com.example.apirestlaptop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola Mundo!!";
    }
}
