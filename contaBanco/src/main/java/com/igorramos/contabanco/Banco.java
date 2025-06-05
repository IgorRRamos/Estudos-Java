package com.igorramos.contabanco;
import java.util.Random;

public class Banco {
    Random random = new Random();
    int min=0;
    int max=9;
    
    public int[] numConta = new int[4];
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public Banco(String dono, String tipo) {
        this.dono = dono;
        this.tipo = tipo;
        this.saldo = 0;
        this.status = false;       
    }
    
    public void status(){
        System.out.println("Titular: " + getDono());
        System.out.print("Numero da conta: ");
        for(int i=0;i<4;i++){
        System.out.print(this.numConta[i]);
        }
        System.out.println("");
        System.out.println("Saldo: " + getSaldo());
    }

    public void abrirConta() {
        setStatus(true);
        if (getTipo() == "CC") {
            setSaldo(100.0);
        } else if (getTipo() == "CP") {
            setSaldo(50.0);
        }
        for(int i=0;i<4;i++){
            this.numConta[i] = random.nextInt(max - min + 1);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if(isStatus() == false && this.getSaldo() > 0.0){
            System.out.println("Impssível  fechar conta!");
        }else{
            System.out.println("Conta inativada!");
            setStatus(false);
        }
    }
    
    public  void depositar(double valor){
        if(isStatus() == false){
            System.out.println("Impossível depositar  conta inativa!");
        }else{
            System.out.println("Deposito realizado com sucesso!");
            setSaldo(getSaldo() + valor);
        }
    }
    
    public void sacar(double valor){
        if(isStatus() == false){
            System.out.println("Impossível sacar conta  inativa!");
            if(getSaldo() < valor){
                System.out.println("Impossível sacar saldo  insuficiente!");
            }
        }else{
            System.out.println("Saque realizado com sucesso!");
            setSaldo(getSaldo () - valor);
        }
    }
    
    public void pagarMensal(){
        if(!isStatus()){
            if(getSaldo() < 20){
                System.out.println("Conta inativada devida a falta de saldo para mensalidade!");
                setStatus(false);
            }
        }else{
            System.out.println("Mensalidade paga com sucesso!");
            setSaldo(getSaldo() - 20);
        }
    }

    public int[] getNumConta() {
        return numConta;
    }

    public void setNumConta(int[] numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
