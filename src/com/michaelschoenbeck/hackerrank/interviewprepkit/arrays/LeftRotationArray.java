package com.michaelschoenbeck.hackerrank.interviewprepkit.arrays;

public class LeftRotationArray {

    public static int[] rotLeft(int[] a, int d) {
        int[] result = new int[a.length];

        for(int i = 0; i<a.length; i++) {
            if(i < a.length - d)  {
                result[i] = a[i+d];
            } else  {
                result[i] = a[i+d-a.length] ;
            }
        }   return result;
    }
}
