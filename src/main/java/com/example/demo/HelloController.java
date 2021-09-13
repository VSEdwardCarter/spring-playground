package com.example.demo;

//Spring to handle incoming requests
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/")
    public String getGreeting(){
        return "Hello from Edward";
    }
}