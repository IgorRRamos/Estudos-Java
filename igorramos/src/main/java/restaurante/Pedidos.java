package restaurante;
import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    private static int contador = 1;
    private int id;
    private List<Cardapio> itens;
    private double valorTotal;

    public Pedidos(List<Cardapio> itens) {
        this.id = contador++;
        this.itens = new ArrayList<>(itens);
        this.valorTotal = calculaTotal();
    }
    
    private double calculaTotal(){
        double total = 0;
        for(Cardapio item : itens){
              total += item.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "id=" + id + ", itens=" + itens + ", valorTotal=" + valorTotal + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Cardapio> getItens() {
        return itens;
    }

    public void setItens(List<Cardapio> itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
