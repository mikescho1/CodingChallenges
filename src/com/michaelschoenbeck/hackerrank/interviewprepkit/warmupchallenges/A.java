package com.michaelschoenbeck.hackerrank.interviewprepkit.warmupchallenges;

public class A {

//    public static List<String> funWithAnagrams(List<String> text) {
//        ArrayList<String> copyOfText = new ArrayList<>(text);
//        ArrayList<String> strList = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
//        ArrayList<Character> charlist = new ArrayList<>();
//
//        for (String s : copyOfText) {
//            s = s.toLowerCase();
//            s = s.replaceAll("\\s", "");
//        }
//
//        String temp = "";
//        for (String s : copyOfText) {
//            for (int i = 1; i < s.length(); i++) {
//                copyOfText.set(i, stringSort(copyOfText.get(i)));
//            }
//
//        }
//        String temp2 = "";
//        for (int i = 0; i < copyOfText.size(); i++) {
//            for (int j = 0; j < copyOfText.size(); j++) {
//                if (copyOfText.get(j).equals(copyOfText.get(i))) {
//                    strList.add(copyOfText.get(i));
//                    copyOfText.remove(j);
//                }
//            }
//        }
//    }


//    public static String stringSort(String str1) {
//        char temp = 'a';
//        char[] chars = str1.toCharArray();
//        for(int i = 1; i < chars.length; i++)   {
//            if(chars[i] < chars[i-1])   {
//                temp = chars[i];
//                chars[i] = chars[i-1];
//                chars[i-1] = temp;
//            }
//            str1 = chars.toString();
//            return str1;
//        }


//    @Override
//    public int compare(StringBuffer strBuf1, StringBuffer strBuf2) {
//        return strBuf1.toString().compareTo(strBuf2.toString());
//    }
}
