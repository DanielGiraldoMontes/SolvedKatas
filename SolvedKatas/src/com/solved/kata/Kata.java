/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solved.kata;

/**
 *
 * @author dgiraldo
 */
public class Kata {

    public static char triangle(final String row) {
        //System.out.println(row);
        //String fila = replaceCharacter(row);
        //System.out.println(fila);

        char[] caracteres = row.toCharArray();
        int pos = (caracteres.length);

        while (pos > 1) {
            for (int posicion = 0; posicion < (pos - 1); posicion++) {
                caracteres[posicion] = validaColor(caracteres[posicion], caracteres[posicion + 1]);
            }
            pos--;
        }
        return caracteres[0];
    }

    /**
     * @param letraUno Letra de comparación 1
     * @param letraDos Letra de compraración 2
     * @return Retorna el caracter que queda al realiar la evaluación necesaria.
     */
    private static char validaColor(char letraUno, char letraDos) {
        if (letraUno == letraDos) {
            return letraUno;
        }

        String letras = letraUno + "" + letraDos;

        if (letras.contains("R") && letras.contains("B")) {
            return 'G';
        }

        if (letras.contains("R") && letras.contains("G")) {
            return 'B';
        }

        if (letras.contains("G") && letras.contains("B")) {
            return 'R';
        }
        return letraUno;
    }

    private static String replaceCharacter(String row) {
        row = row.replace("RBRGBRB", "G");
        return row;
    }
}
