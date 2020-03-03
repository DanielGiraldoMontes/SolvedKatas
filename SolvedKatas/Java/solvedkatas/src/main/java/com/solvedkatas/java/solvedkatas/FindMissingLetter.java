/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solvedkatas.java.solvedkatas;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dgiraldo
 */
public class FindMissingLetter {

    public static char findMissingLetter(char[] array) {
        char[] alphabet = null;
        Pattern lowerPattern = Pattern.compile("[a-z]");
        Matcher matcher = lowerPattern.matcher(Arrays.toString(array));

        if (matcher.find()) {
            alphabet = new char[]{'a', 'b', 'c', 'd',
                'e', 'f', 'g', 'h',
                'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p',
                'q', 'r', 's', 't',
                'u', 'v', 'w', 'x',
                'y', 'z'};
        } else {
            alphabet = new char[]{'A', 'B', 'C', 'D',
                'E', 'F', 'G', 'H',
                'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X',
                'Y', 'Z'};
        }

        int index = Arrays.toString(alphabet).replace("'", "").replace("[", "").replace("]", "").replace(" ", "").replace(",", "").indexOf(array[0]);

        for (int i = 1; i < array.length; i++) {
            index++;
            if (alphabet[index] != array[i]) {
                return alphabet[index];
            }

            if (index == 25) {
                index = -1;
            }
        }

        return ' ';
    }
}
