package com.igorramos.jogo.padrao.users;
import com.igorramos.jogo.padrao.RaizTipo;

public class Usuario extends RaizTipo{

    public Usuario(String nick) {
        super(nick);
        this.setLevel(1);
        this.setVida(10);
        this.setForca(25);
        this.setDefesa(20);
    }
    
    public void almentarNv(){
        setLevel(getLevel() + 1);
        setVida(getVida() + 5);
        setForca(getForca() + 5);
        setDefesa(getDefesa() + 5);
    }
    
    public void morrer(){
        setLevel(1);
        setVida(10);
        setForca(25);
        setDefesa(20);
    }   

    @Override
    public String toString() {
        return "Nick: " + getNick() + " / Nv:  " + getLevel() + "";
    }
    
     
}
