package com.igorramos.colunanamatriz;
import java.util.Scanner;

public class ColunaNaMatriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double m [][] = new double [3][3];
        double soma=0;
        
        int C = entrada.nextInt();
        char T = entrada.next().toUpperCase().charAt(0);
        
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                m[i][j]= entrada.nextDouble();
            }
        }
        
        if(T == 'S'){
            for(int i=0;i<m.length;i++){
                    soma += m[i][C]; 
            }
        }else if(T == 'M'){
            for(int i=0;i<m.length;i++){
                    soma += m[i][C] / 12;
            }
        }
        
        System.out.printf("%.1f", soma);
        
        entrada.close();
    }
}
