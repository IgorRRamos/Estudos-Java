package monstros;
import com.igorramos.jogo.padrao.RaizTipo;

public class Urso extends RaizTipo{

    public Urso(String nick) {
        super(nick);
        this.setVida(15);
        this.setLevel(2);
        this.setDefesa(25);
        this.setForca(30);
    }
  
    @Override
    public String toString() {
        return "Nick: " + getNick() + " / Nv:  " + getLevel() + "";
    }
    
}
