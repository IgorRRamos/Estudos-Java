package com.igorramos.acimadiagonalsecundaria;

import java.util.Scanner;

public class AcimaDiagonalSecundaria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double m[][] = new double[12][12];
        char O = entrada.next().toUpperCase().charAt(0);
        double result = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = entrada.nextDouble();
            }
        }

        int contador = 11;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < contador; j++) {
                result += m[i][j];
            }
            contador--;
        }

        if (O == 'M') {
            result /= ((m.length * m.length) - 12) / 2;
        }
        
        System.out.println(String.format("%.1f", result));

        entrada.close();
    }
}
