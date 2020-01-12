package com.michaelschoenbeck.coderbyte;

public class Palindrome {

    public static String Palindrome(String str) {
        str=str.replaceAll("\\s+","");

        String palindrome = "true";

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                palindrome = "false";
            }

        }
        return palindrome;


    }
}
