package com.example.randomPasswordGenerator;

import org.apache.commons.lang3.RandomStringUtils;

public  class RandomPassword {

    public static String randomPassword(){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String pwd = RandomStringUtils.random( 6, characters );
        return pwd;
    }
}
