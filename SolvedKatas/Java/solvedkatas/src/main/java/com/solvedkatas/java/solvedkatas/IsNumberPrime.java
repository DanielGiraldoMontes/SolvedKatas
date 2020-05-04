package com.solvedkatas.java.solvedkatas;

public class IsNumberPrime {
    public static boolean isPrime(int num) {
        int contador = 2;
        while ((contador != num) && num > 0) {
            if (num % contador == 0)
                return false;
            contador++;
        }
        return true;
    }
}