package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WordCounterController {
    private WordCounter bob;

    public WordCounterController(WordCounter bob){
        this.bob = bob;
    }

    @PostMapping("/words/count")
    public Map<String, Integer> wordCountResults(@RequestBody String apple){
        return bob.count(apple);
    }
}
