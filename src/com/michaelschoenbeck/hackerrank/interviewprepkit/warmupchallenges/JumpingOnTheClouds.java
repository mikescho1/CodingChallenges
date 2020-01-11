package com.michaelschoenbeck.hackerrank.interviewprepkit.warmupchallenges;

public class JumpingOnTheClouds {
    public static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int i = 0;
        while(i!=c.length-1) {
            if(i+1 == c.length-1)    {
                jumps++;
                break;
            }
            if(c[i+2] == 0) {
                jumps++;
                i++;
            }
            else    {
                jumps++;
            }
            i++;
        }
        return jumps;


    }

}
