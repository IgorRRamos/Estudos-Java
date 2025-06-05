package com.igorramos.vetoriii;

import java.util.Scanner;

public class VetorIII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] n = new double[100];

        double x = sc.nextDouble();

        n[0] = x;

        for (int i = 1; i < 100; i++) {
            n[i] = n[i-1] / 2.0;
        }

        for (int i = 0; i < 100; i++) {
            System.out.printf("N[%d] = %.4f%n",  i , n[i]);
        }

        sc.close();
    }
}
