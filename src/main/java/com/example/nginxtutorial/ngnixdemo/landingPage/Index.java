package com.example.nginxtutorial.ngnixdemo.landingPage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

    @GetMapping("/")
    public String welcomeMessage(){
        return "Hello- World";
    }

    @GetMapping("/products")
    public String products(){
        return "No products yet";
    }


}
