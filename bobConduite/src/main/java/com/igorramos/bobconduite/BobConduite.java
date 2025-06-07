package com.igorramos.bobconduite;

import java.util.Scanner;

public class BobConduite {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int raio, r1, r2, c;

        c = entrada.nextInt();

        for (int i = 0; i < c; i++) {
            r1 = entrada.nextInt();
            r2 = entrada.nextInt();
            
            raio = r1 + r2;
            System.out.println(raio);
        }
        
        entrada.close();
    }
}
