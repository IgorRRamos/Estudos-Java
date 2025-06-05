package com.igorramos.preenchimentovetorvi;

import java.util.Scanner;

public class PreenchimentoVetorVI {

    public static void main(String[] args) {
        int[] x = new int[5];
        int[] y = new int[5];

        Scanner entrada = new Scanner(System.in);

        int num, contImpar = 0, contPar = 0;

        for (int i = 0; i < 15; i++) {

            num = entrada.nextInt();

            if (num % 2 == 0) {
                x[contPar++] = num;

                if (contPar == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("par[" + j + "] = " + x[j]);
                        x[j] = 0;
                    }
                    contPar = 0;
                }
            } else {
                y[contImpar++] = num;

                if (contImpar == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("impar[" + j + "] = " + y[j]);
                        y[j] = 0;
                    }
                    contImpar = 0;
                }
            }
        }
        
        for (int i = 0; i < contImpar; i++) {
            if (y[i] != 0) {
                System.out.println("impar[" + i + "] = " + y[i]);
            }
        }

        for (int i = 0; i < contPar; i++) {
            if (x[i] != 0) {
                System.out.println("par[" + i + "] = " + x[i]);
            }
        }
        
        entrada.close();
    }
}
