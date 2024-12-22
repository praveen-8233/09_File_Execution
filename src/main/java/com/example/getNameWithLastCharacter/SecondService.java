package com.example.getNameWithLastCharacter;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SecondService {

    public String getNames(){
        List<String> list = Arrays.asList("Mercedes","Mahindra","Toyoto","Mitubishi","Mustung");
        List getAllNamesWithLastCharacter = list.stream()
                .filter(name->name.endsWith("a")||name.endsWith("A"))
                .collect(Collectors.toList());
        int count = getAllNamesWithLastCharacter.size();
        return "Names ends with 'A': " + getAllNamesWithLastCharacter + ", Total count: " + count;
    }
}
