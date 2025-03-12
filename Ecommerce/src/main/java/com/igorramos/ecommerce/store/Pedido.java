package com.igorramos.ecommerce.store;
import com.igorramos.ecommerce.users.Usuario;
import com.igorramos.ecommerce.store.Produto;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Usuario usuario;
    private List<Produto> itens;
    private double total;

    public Pedido(Usuario usuario, List<Produto> itens) {
        this.usuario = usuario;
        this.itens = new ArrayList<>(itens);
        this.total = itens.stream().mapToDouble(Produto :: getPreco).sum();
    }
    
    public void listarPedido(){
        System.out.println("Pedidos: " + usuario.getNome());
        for(Produto list : itens){
             System.out.println("Produto: " + list.getNome() + " Valor: R$ " + list.getPreco());
        }
        System.out.println("Total: R$ " + total);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Produto> getItens() {
        return itens;
    }

    public void setItens(List<Produto> itens) {
        this.itens = itens;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
