package com.michaelschoenbeck.hackerrank.interviewprepkit.warmupchallenges;

public class RepeatedString {


    public static long repeatedString(String s, long n) {
        long counter = 0;
        int i = 0;

        if (s.equals("a")) {
            counter = n;
        } else {
            for (i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    counter++;
                }
            }
            long numOfSs = (n / s.length());
            long remainingLetters = (n % s.length());
            counter *= numOfSs;

            i = 0;
            while (i < remainingLetters) {
                if (s.charAt(i) == 'a') {
                    counter++;
                }
                i++;
            }
        }
        return counter;
    }
}
