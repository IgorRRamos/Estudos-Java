package com.igorramos.menoreposicao;

import java.util.Scanner;

public class MenorEposicao {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
    
    int n, menor,cont=0;
    
    n = entrada.nextInt();
    
    int[] x = new int[n];
    
    for(int i=0; i < n; i ++){
        x[i] = entrada.nextInt();        
    }
    menor=x[0];
    for(int i=0; i < n; i++){        
        if(x[i] < menor){
            menor = x[i];
            cont=i;
        }
    }
    
    System.out.println("Menor valor: " + menor);
    System.out.println("Posicao: " + cont);
    }
}
