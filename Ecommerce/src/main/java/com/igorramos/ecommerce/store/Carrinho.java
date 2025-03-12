package com.igorramos.ecommerce.store;
import com.igorramos.ecommerce.store.Produto;
import com.igorramos.ecommerce.users.Usuario;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private Usuario user;
    private List<Produto> produtos;

    public Carrinho(Usuario user) {
        this.user = user;
        this.produtos = new  ArrayList<Produto>();
    }

    public void adCarrinho(Produto p, Estoque estoque) {
        if(estoque.verificarEstoque(p.getId(), 1)){
            produtos.add(p);
            estoque.removerProduto(p.getId(), 1);
            System.out.println("Produto adicionado ao carrinho!");
        }      
            System.out.println("Não temos esse produto no estoque!");
    }

    public void remover(Produto produto) {
        produtos.remove(produto);
        System.out.println("Produto removido com sucesso!");
    } 
    
    public double calcularTotal(){
        return produtos.stream().mapToDouble(Produto :: getPreco).sum();
    }
    
    public void limparCarrinho(){
        produtos.clear();
        System.out.println("Caarinho vazio!");
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produto) {
        this.produtos = produto;
    }
}
