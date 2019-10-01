/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solved.kata.test;

import com.solved.kata.PerfectSquare;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author dgiraldo
 */
public class PerfectSquareTest {

    @Test
    public void test1() {
        assertEquals(144, PerfectSquare.findNextSquare(121));
    }

    @Test
    public void test2() {
        assertEquals(676, PerfectSquare.findNextSquare(625));
    }

    @Test
    public void test3() {
        assertEquals(-1, PerfectSquare.findNextSquare(114));
    }

    public static void main(String[] args) {
        System.out.println(PerfectSquare.findNextSquare(122));
    }
}
