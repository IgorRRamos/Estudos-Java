package com.igorramos.numeroprimo;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        
        x=sc.nextInt();
        
        for(int i=0;i<x;i++){
            y = sc.nextInt();
            int cont=0;
            
            for(int j=1;j<=y;j++){
                if(y%j==0){
                    cont++;
                }
            }
            if(cont > 2){
                System.out.println(y + " nao eh primo");
            }else{
                System.out.println(y + " eh primo");
            }
        }
    }
}
