package com.example.getNameWithStartCharacter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/fileCount")
    public String getFileCount(){
        return myService.countOfFile();

    }
}
