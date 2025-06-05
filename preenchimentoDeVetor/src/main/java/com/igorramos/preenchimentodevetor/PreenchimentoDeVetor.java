package com.igorramos.preenchimentodevetor;

import java.util.Scanner;

public class PreenchimentoDeVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[10];

        n[0] = sc.nextInt();
        System.out.println("N[0] = "+n[0]);
        
        for (int i = 1; i < 10; i++) {
            n[i] = n[i - 1] * 2;
            System.out.println("N["+i+"] = "+n[i]);
        }
        sc.close();
    }
}
