package com.igorramos.Dados;
import java.util.List;
import java.util.ArrayList;

public class Dados {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        
        lista.add("Goku");
        lista.add("Vegeta");
        lista.add("Buma");
        lista.add("Neymar");
        lista.add("Lula");
        lista.add("Bolsonaro");
        
        for(String list : lista){
            int contador=0;
            System.out.println("Posição -  " + contador +  " = " + list);
            contador++;
        }
        
        
        
    }
}
