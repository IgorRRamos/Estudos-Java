package com.igorramos.selecaoemvetor;

import java.util.Scanner;

public class SelecaoEmVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] a = new double[100];

        for (int i = 0; i < 100; i++) {
            a[i] = sc.nextDouble();
        }

        for (int i = 0; i < 100; i++) {
            if (a[i] <= 10) {
                System.out.println("A[" + i + "] = " + a[i]);
            }
        }

        sc.close();
    }
}
