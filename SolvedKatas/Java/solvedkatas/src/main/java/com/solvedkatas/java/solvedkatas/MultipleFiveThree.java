package com.solvedkatas.java.solvedkatas;

import java.util.stream.IntStream;

public class MultipleFiveThree {

    public int solution(int number) {
        return IntStream.range(3, number).filter(result -> result % 3 == 0 || result % 5 == 0).sum();
    }
}