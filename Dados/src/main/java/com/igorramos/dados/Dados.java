package com.igorramos.dados;
import java.util.ArrayList;
import java.util.List;

public class Dados {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        
        lista.add("Goku");
        lista.add("Vegeta");
        lista.add("Buma");
        lista.add("Neymar");
        lista.add("Lula");
        lista.add("Bolsonaro");
        
        int contador=0;
        for(String list : lista){
            
            System.out.println("Posicao -  " + contador +  " = " + list);
            contador++;
        }
    }
}
