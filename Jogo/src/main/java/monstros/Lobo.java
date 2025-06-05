package monstros;
import com.igorramos.jogo.padrao.RaizTipo;

public class Lobo extends RaizTipo{

    public Lobo(String nick) {
        super(nick);
        this.setLevel(1);
        this.setVida(10);
        this.setForca(25);
        this.setDefesa(20);
    }
    
    @Override
    public String toString() {
        return "Nick: " + getNick() + " / Nv:  " + getLevel() + "";
    }
    
}
