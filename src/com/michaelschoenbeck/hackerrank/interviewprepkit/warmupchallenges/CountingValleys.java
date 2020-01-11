package com.michaelschoenbeck.hackerrank.interviewprepkit.warmupchallenges;

public class CountingValleys {


    public static int countingValleys(int n, String s) {
        int valleys = 0;
        int altitude = 0;
        boolean valley = false;
        int counter = 0;

        String[] steps = s.split("");


        for (int i = 1; i < steps.length; i++) {
            if(steps[i].equals("D"))    {
                altitude--;
            }   else {
                altitude++;
            }
            if (altitude >= 0) {
                valley = false;
                counter = 0;
            }
            else{
                valley = true;
                counter++;
                if (counter == 1) {
                    valleys++;
                }
            }
        }
        return valleys;

    }

}
