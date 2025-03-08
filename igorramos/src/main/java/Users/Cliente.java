package Users;
import java.util.ArrayList;
import java.util.List;
import restaurante.Cardapio;
import restaurante.Pedidos;

public class Cliente extends Pessoa{
    private List<Pedidos> historico;    
    
    
    public Cliente(String nome, int idade) {    
        super(nome, idade);
        this.historico = new ArrayList<>();
    }
    
    public void adHistorico(Pedidos pedido){
        historico.add(pedido);
    }

    public List<Pedidos> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Pedidos> historico) {
        this.historico = historico;
    }
}
