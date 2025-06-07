package com.igorramos.encapsulamento;

public class Controle implements Controlador {

    //Atributos
    private int volume;
    private boolean ligado, tocando;

    public Controle() {
        this.ligado = false;
        this.tocando = false;
        this.volume = 50;
    }

    //Metodos
    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("Ligado!");
    }

    @Override
    public void desligar() {
        if (isLigado()) {
            this.ligado = false;
            System.out.println("Desligando!");
        }
    }

    @Override
    public void abrirMenu() {
        if (isLigado()) {
            if (isTocando()) {
                System.out.println("Ligado!");
                System.out.println("Tocando!");
                System.out.println(getVolume());
                for (int i = 0; i < this.volume; i += 5) {
                    System.out.print("[] ");
                }
            }
        } else {
            System.out.println("Desligado!");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu!");
    }

    @Override
    public void maisVolume() {
        if (isLigado()) {
            this.volume += 5;
        }
    }

    @Override
    public void menosVolume() {
        if (isLigado()) {
            this.volume -= 5;
        }
    }

    @Override
    public void ligarMudo() {
        if (isLigado()) {
            if (isTocando()) {
                this.volume = 0;
            } else {
                System.out.println("Não está tocando!");
            }
        }
    }

    @Override
    public void desligarMudo() {
        if (isLigado()) {
            if (!isTocando()) {
                this.volume = 50;
            } else {
                System.out.println("Não está tocando!");
            }
        }
    }

    @Override
    public void play() {
        if (isLigado()) {
            if (!isTocando()) {
                this.tocando = true;
            } else {
                System.out.println("Já está tocando");
            }
        }
    }

    @Override
    public void pause() {
        if (isLigado()) {
            if (isTocando()) {
                this.tocando = false;
            } else {
                System.out.println("Já está pausado!");
            }
        }
    }

    //Metodos especiais
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

}
