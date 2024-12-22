package com.example.getNameWithLastCharacter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySecondController {

    @Autowired
    private SecondService secondService;

    @GetMapping("/second")
    public String getNames(){
        return secondService.getNames();
    }
}
