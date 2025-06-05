package com.igorramos.preenchimentodeveto;

import java.util.Scanner;

public class PreenchimentoDeVeto {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] n = new int[1000];

            int t = sc.nextInt();
            int x = 0;

            for (int i = 0; i < 1000; i++) {

                if (x == t) {
                    x = 0;
                }
                n[i] = x;
                x++;
            }

            for (int i = 0; i < 1000; i++) {
                System.out.println("N[" + i + "] = " + n[i]);
            }

    }
}
