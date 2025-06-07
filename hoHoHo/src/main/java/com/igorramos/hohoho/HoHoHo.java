package com.igorramos.hohoho;
import java.util.Scanner;

public class HoHoHo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n = entrada.nextInt();
        
        for(int i=1;i<=n;i++){
            if(i < n){
                System.out.print("Ho ");
            }else if(i == n){
                System.out.println("Ho!");
            }
        }
        
        
        entrada.close();
    }
}
