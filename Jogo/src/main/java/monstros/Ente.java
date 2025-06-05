package monstros;
import com.igorramos.jogo.padrao.RaizTipo;
import com.igorramos.jogo.padrao.users.Usuario;

public class Ente extends RaizTipo{
    private Usuario user;

    public Ente(String nick) {
        super(nick);
        this.setVida(20);
        this.setLevel(3);
        this.setDefesa(30);
        this.setForca(35);
    }
  
    @Override
    public String toString() {
        return "Nick: " + getNick() + " / Nv:  " + getLevel() + "";
    }
}
