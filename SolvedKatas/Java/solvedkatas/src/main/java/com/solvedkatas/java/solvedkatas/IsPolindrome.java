package com.solvedkatas.java.solvedkatas;

public class IsPolindrome {
    public static boolean IsCasePolindrome(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = (word.length() - 1); i == 0; i--) {
            stringBuilder.append(word.charAt(i));
        }

        if (word == stringBuilder.toString())
            return true;

        return false;
    }
}