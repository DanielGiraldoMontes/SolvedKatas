/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solvedkatas.java.solvedkatas;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author dgiraldo
 */
public class AlphabeticalAditionTest {

    @Test
    public void fixedTests() {
        assertEquals("f", AlphabeticalAdition.addLetters("a", "b", "c"));
        assertEquals("z", AlphabeticalAdition.addLetters("z"));
        assertEquals("c", AlphabeticalAdition.addLetters("a", "b"));
        assertEquals("c", AlphabeticalAdition.addLetters("c"));
        assertEquals("a", AlphabeticalAdition.addLetters("z", "a"));
        assertEquals("d", AlphabeticalAdition.addLetters("y", "c", "b"));
        assertEquals("z", AlphabeticalAdition.addLetters());
    }
}
