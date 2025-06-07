package com.igorramos.coneta;

public class Pen {

    private String modelo;
    private String cor;
    private double ponta;
    private int carga;
    private boolean tampada;

    public Pen(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = 0.5;
        this.carga = 100;
        this.tampada = true;
    }

    @Override
    public String toString() {
        return "Pen{" + "modelo=" + modelo + ", cor=" + cor + ", ponta=" + ponta + ", carga=" + carga + ", tampada=" + tampada + '}';
    }
    
    

    public void escrever() {
        if (!isTampada()) {
            System.out.println("Escrevendo...");
            setCarga(getCarga() - 1);
        } else {
            System.out.println("Caneta tampada!");
        }
    }

    public void rabiscar() {
        if(!isTampada()){
            System.out.println("Rabiscando...");
            setCarga(getCarga() - 2);
        }else{
            System.out.println("Caneta tamapda!");
        }
        
    }

    public void pintar() {
        if(!isTampada()){
        System.out.println("Pintando...");
        setCarga(getCarga() - 3);
        }else{
            System.out.println("Caneta tampada!");
        }
        }

    public void tampar() {
        if (!isTampada()) {
            setTampada(true);
        } else {
            System.out.println("Já tampada!");
        }
    }

    public void destampar() {
        if (isTampada()) {
            setTampada(false);
        } else {
            System.out.println("Já destampada!");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

}
