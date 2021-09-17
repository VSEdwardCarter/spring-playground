package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointsController {

    @GetMapping("/endpoints")
    public String getIndex(){
        return "Get to index route";
    }

    @GetMapping("/tasks")
    public String getTasks(){
        return "These are tasks";
    }

    @PostMapping("/tasks")
    public String createTask(){
        return "You just POSTed to /tasks";
    }
}
