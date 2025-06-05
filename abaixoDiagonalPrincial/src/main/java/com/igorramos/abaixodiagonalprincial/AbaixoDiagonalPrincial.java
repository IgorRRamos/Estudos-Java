package com.igorramos.abaixodiagonalprincial;

import java.util.Scanner;

public class AbaixoDiagonalPrincial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double M[][] = new double[12][12];
        char o = entrada.next().toUpperCase().charAt(0);
        double result = 0;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (i > j) {
                    result += M[i][j];
                }
            }
        }

        if (o == 'M') {
            result /= ((M.length * M.length) - 12) / 2;
        }
        
        System.out.println(String.format("%.1f", result));
        
        entrada.close();
    }
}
