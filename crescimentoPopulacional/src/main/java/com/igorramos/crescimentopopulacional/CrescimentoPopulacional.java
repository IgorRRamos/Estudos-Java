package com.igorramos.crescimentopopulacional;

import java.util.Scanner;

public class CrescimentoPopulacional {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int casos = entrada.nextInt();
        
        for (int i = 0; i < casos; i++) {
            int pa = entrada.nextInt();
            int pb = entrada.nextInt();
            double g1 = entrada.nextDouble();
            double g2 = entrada.nextDouble();
            
             if (pa <= 0 || pb <= 0 || g1 <= 0 || g2 < 0) {
                System.out.println("Entrada inválida. Valores devem ser positivos.");
                continue; 
            }

            int anos = 0;

            while (pa <= pb) {
                pa += (int) (pa * (g1 / 100));
                pb += (int) (pb * (g2 / 100));
                anos++;

                if (anos > 100) break;
            }

            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos);
            }
        }

        entrada.close();
    }
}
