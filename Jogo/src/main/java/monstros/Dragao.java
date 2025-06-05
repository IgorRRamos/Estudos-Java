package monstros;
import com.igorramos.jogo.padrao.RaizTipo;

public class Dragao extends RaizTipo{

    public Dragao(String nick) {
        super(nick);
        this.setVida(25);
        this.setLevel(4);
        this.setDefesa(35);
        this.setForca(40);
    }
    
    @Override
    public String toString() {
        return "Nick: " + getNick() + " / Nv:  " + getLevel() + "";
    }
}
