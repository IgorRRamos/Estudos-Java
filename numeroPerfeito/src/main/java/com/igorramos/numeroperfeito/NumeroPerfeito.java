package com.igorramos.numeroperfeito;

import java.util.Scanner;

public class NumeroPerfeito {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int c, x;
        c = sc.nextInt();
        
        for(int i=0;i<c;i++){
            int soma=0;
            x=sc.nextInt();
            
            for(int j=1;j<x;j++){
                if(x%j==0){
                    soma+=j;
                }
            }
            if(soma == x){
                System.out.println(x + " eh perfeito");
            }else{
                System.out.println(x + " nao eh perfeito");
            }
        }
        
        sc.close();
    }
}
