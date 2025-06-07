package com.igorramos.coneta;

public class Coneta {

    public static void main(String[] args) {
     
        Pen caneta =  new Pen("Bic", "Azul");
        
        System.out.println(caneta.toString());
        
        caneta.destampar();
        caneta.escrever();
        
    }
}
