package com.igorramos.acimadiagonalprincipal;

import java.io.IOException;
import java.util.Scanner;

public class AcimaDiagonalPrincipal {

    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        double m[][] = new double[12][12];
        char o = entrada.next().toUpperCase().charAt(0);
        double result = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (j > i) {
                    result += m[i][j];
                }
            }
        }

        if (o == 'M') {
            result /= ((m.length * m.length) - 12) / 2;
        }

        System.out.println(String.format("%.1f", result));
        
        entrada.close();
    }
}
