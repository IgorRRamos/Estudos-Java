package com.igorramos.linhanamatriz;

import java.util.Scanner;

public class LinhaNaMatriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor = 0
                ;
        int l = entrada.nextInt();
        char t = entrada.next().toUpperCase().charAt(0);

        double m [][] = new double[12][12];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = entrada.nextDouble();
            }
        }

        if (t == 'S') {
            for (int i = 0; i < m.length; i++) {
                valor += m[l][i];
            }
        } else if (t == 'M') {
            for (int i = 0; i < m.length; i++) {
                valor += m[l][i] / 12;
            }
        }

        System.out.println(valor);

        entrada.close();
    }
}
