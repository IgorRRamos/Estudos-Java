package com.igorramos.areaEsquerda;

import java.util.Scanner;

public class AreaEsquerda {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double m[][] = new double[12][12];
        char o = entrada.next().toUpperCase().charAt(0);
        double result = 0;
        int contador = 11;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < m.length; i++) {
            for(int j=0;j<m[i].length;j++){
                if(i > j && j < contador){
                    result += m[i][j];
                }
            }
            contador--;
        }
        
        if(o == 'M'){
            result /= ((m.length * m.length) - 24) / 4;
        }
        
        System.out.println(String.format("%.1f", result));

        entrada.close();
    }
}
