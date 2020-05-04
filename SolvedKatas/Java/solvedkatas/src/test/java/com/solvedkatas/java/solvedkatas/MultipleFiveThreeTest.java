package com.solvedkatas.java.solvedkatas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultipleFiveThreeTest {
    @Test
    public void test() {
      assertEquals(23, new MultipleFiveThree().solution(10));
    }
}