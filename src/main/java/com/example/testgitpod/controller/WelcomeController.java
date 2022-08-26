package com.example.testgitpod.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String main() {
        String random = String.valueOf(new Random().nextInt(10));
        return "Hello World !! random = " + random;
    }

}
