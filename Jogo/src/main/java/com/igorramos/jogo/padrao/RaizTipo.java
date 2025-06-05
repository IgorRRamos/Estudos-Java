package com.igorramos.jogo.padrao;

public abstract class RaizTipo {
    private String nick;
    private int vida, level, forca, defesa; 

    public RaizTipo(String nick) {
        this.nick = nick;
        this.vida = 0;
        this.level =0;
        this.defesa = 0;
        this.forca = 0;
    }
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }   

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }   
}
