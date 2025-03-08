package restaurante;
import Users.Cliente;
import java.util.ArrayList;
import java.util.List;


public class Restaurante {
    private String nome;
    private List<Cardapio> cardapio;

    public Restaurante(String nome) {
        this.nome = nome;
        this.cardapio = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco){
        cardapio.add(new Cardapio(nome, preco));
    }
    
    public Pedidos fazerPedido(Cliente cliente, List<Cardapio> itens){
        Pedidos pedido = new Pedidos(itens);
        cliente.adHistorico(pedido);
        return pedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cardapio> getCardapio() {
        return cardapio;
    }

    public void setCardapio(ArrayList<Cardapio> cardapio) {
        this.cardapio = cardapio;
    }
    
    
    
    
    
    
    
}
