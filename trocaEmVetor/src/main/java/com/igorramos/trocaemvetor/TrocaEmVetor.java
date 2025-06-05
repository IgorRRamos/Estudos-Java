package com.igorramos.trocaemvetor;
import java.util.Scanner;
public class TrocaEmVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[20];
        
        for(int i=0;i<20;i++){
            n[i]=sc.nextInt();
        }
        
        int x=0,c=19;
        for(int i=0;i<10;i++){
            int v1,v2;
            v1=n[x];
            v2=n[c];
            
            n[x]=v2;
            n[c]=v1;
            
            x++;
            c--;
        }
        
        for(int i=0;i<20;i++){
            System.out.println("N[" + i + "] = " + n[i]);
        }
        
        
        
        
        
        sc.close();
    }
}
