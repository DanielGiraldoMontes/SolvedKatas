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
public class DetectPangram {

    public boolean check(String sentence) {
        return sentence.toLowerCase()
                .replaceAll("[^a-z]", "")
                .replaceAll("(.)(?=.*\\1)", "")
                .length() == 26;
    }
}
