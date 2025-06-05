package com.igorramos.somadosparesconsecutivos;

import java.util.Scanner;

public class SomaDosParesConsecutivos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = 0;

        do {
            x = entrada.nextInt();
            if (x != 0) {

                if (x % 2 != 0) {
                    x++;
                }

                int soma = 0;
                for (int i = 0; i < 5; i++) {
                    soma += x;
                    x += 2;
                }

                System.out.println(soma);
            }
        } while (x != 0);

    }
}
