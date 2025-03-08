package br.com.igorramos;
import Users.Cliente;
import java.util.ArrayList;
import java.util.List;
import restaurante.Cardapio;
import restaurante.Pedidos;
import restaurante.Restaurante;

public class Igorramos {

    public static void main(String[] args) {
           Restaurante restaurante = new Restaurante("IgorRamos Alimentações");
           Cliente cliente = new Cliente("Igor", 28);
           
           restaurante.adicionarItem("Açai", 20.0);
           restaurante.adicionarItem("Cafe", 30.0);
           restaurante.adicionarItem("Pizza", 80.0);
           restaurante.adicionarItem("Hamburguer", 33.0);
           restaurante.adicionarItem("Coca-Cola", 10.0);
           restaurante.adicionarItem("Fanta", 8.0);
           restaurante.adicionarItem("Macarrão na chapa", 18.0);
           
           List<Cardapio> pedido =  new ArrayList<>();
           pedido.add(restaurante.getCardapio().get(0));
           pedido.add(restaurante.getCardapio().get(3));
           
           List<Cardapio> pedido1 =  new ArrayList<>();
           pedido1.add(restaurante.getCardapio().get(2));
           pedido1.add(restaurante.getCardapio().get(4));         
           
           restaurante.fazerPedido(cliente, pedido);
           restaurante.fazerPedido(cliente, pedido1);
           
           List<Cardapio> pedido2 = new ArrayList<>();
           pedido2.add(restaurante.getCardapio().get(6));
           pedido2.add(restaurante.getCardapio().get(4));
           
           restaurante.fazerPedido(cliente, pedido2);
           
           System.out.println("Historico de pedidos do cliente: " + cliente.getNome());
           for(Pedidos pedidos : cliente.getHistorico()){
               System.out.println(pedidos);
           }
           
           
          
           
    }
}
