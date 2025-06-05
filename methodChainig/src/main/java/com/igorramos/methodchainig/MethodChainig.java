package com.igorramos.methodchainig;

public class MethodChainig {

    public static void main(String[] args) {
        
        String nome = "igor";
        
        
        nome = nome.concat("  ramos").toUpperCase().trim();
        
        System.out.println(nome);
        
    }
}
