package com.ruslanito.Core_String;

/**
 * Created by Ruslanito on 24.02.2017.
 */
public class String_substring {
    public static void main(String[] args) {
        int start = 6;
        int end = 11;
        String greetings = "Hello World!";
        String substr = greetings.substring(start, end);
        System.out.println (substr);

        System.out.println("* * * * *");
        "Hello World!".substring(6);
        "Hello World!".substring(3, 8);
        System.out.println("Hello World!".substring(start));
        System.out.println("Hello World!".substring(6, 11));
    }
}
