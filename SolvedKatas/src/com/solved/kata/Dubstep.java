/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solved.kata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dgiraldo
 */
public class Dubstep {

    public static String SongDecoder(String song) {
        Pattern patter = Pattern.compile("[WUB]+$");
        Matcher matccher = patter.matcher(song);

        if (matccher.find()) {
            song = song.subSequence(0, (song.length() - 3)).toString();
        }

        song = song.replaceFirst("WUB", "");
        System.out.println(song);
        
        return song;
    }
}
