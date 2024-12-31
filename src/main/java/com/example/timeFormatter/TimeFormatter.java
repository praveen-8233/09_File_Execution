package com.example.timeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatter {

    public static void main(String[] args) {
        LocalDateTime lc = LocalDateTime.now();
        System.out.println(lc);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        System.out.println(lc.format(dateTimeFormatter));

    }
}
