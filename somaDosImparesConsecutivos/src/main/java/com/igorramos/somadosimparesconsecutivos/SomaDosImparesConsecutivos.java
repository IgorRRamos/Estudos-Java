package com.igorramos.somadosimparesconsecutivos;

import java.util.Scanner;

public class SomaDosImparesConsecutivos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int totCaso = entrada.nextInt();
        
        for(int indice=0; indice<totCaso;indice++){
        
        int cont  = entrada.nextInt();
        int num2 = entrada.nextInt();
        
        int totSoma=0;
        int num=0;
        
        
        while(totSoma < num2){
            
            if(cont % 2 != 0){
                num = num + cont;
                totSoma++;
            }
            
           cont++;
        }
        
        System.out.println(num);
        }
        
        entrada.close();
    }
}
