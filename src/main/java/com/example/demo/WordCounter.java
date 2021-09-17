package com.example.demo;



import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

//@Service this will not need a configclass
public class WordCounter {

    public Map<String, Integer> count(String word){
        Map<String, Integer> result = new HashMap<>();
        String[] splitString = word.split(" ");

        for (int i = 0; i < splitString.length; i++) {
            if(!result.containsKey(splitString[i])){
                result.putIfAbsent(splitString[i], 1);
            }else{
                int wordCount = result.get(splitString[i]);
                result.replace(splitString[i], wordCount + 1);
            }
//            result.putIfAbsent(splitString[i],0);
//            int wordCount = result.get(splitString[i]);
//            result.replace(splitString[i], wordCount +1);
        }
         return result;
    }


}
