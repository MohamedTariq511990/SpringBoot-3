package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController{
    String yourFavColor="Blue";
    @GetMapping("/")
    public String getMyFav(){
        return "My favorite color is "+yourFavColor;
        }
}