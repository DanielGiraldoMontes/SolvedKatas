/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solvedkatas.java.solvedkatas;

/**
 *
 * @author dgiraldo
 */
public class AlphabeticalAdition {

    public static String addLetters(String... letters) {
        int index = 0;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (String letter : letters) {
            index += (alphabet.indexOf(letter) + 1);
        }

        if (index == 0) {
            return "z";
        }

        while (index > 26) {
            index -= 26;
        }

        return alphabet.charAt(index - 1) + "";
    }
}
