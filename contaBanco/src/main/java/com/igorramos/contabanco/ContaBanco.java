package com.igorramos.contabanco;

public class ContaBanco {

    public static void main(String[] args) {
        Banco conta = new Banco("Igor", "CC");
        
        
        conta.abrirConta();
        conta.depositar(2500);
        
        conta.status();
        
        conta.sacar(500);
        conta.pagarMensal();
        conta.status();
        
    }
}
