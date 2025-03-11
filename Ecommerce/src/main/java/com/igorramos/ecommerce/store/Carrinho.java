package com.igorramos.ecommerce.store;
import com.igorramos.ecommerce.store.Produto;
import com.igorramos.ecommerce.users.Usuario;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private Usuario user;
    private List<Produto> produtos;
    private Produto produto;

    public Carrinho(Usuario user) {
        this.user = user;
        this.produtos = new ArrayList<Produto>();
    }

    public void listar(){
        for(Produto lista : produtos){
            System.out.println(lista);
        }
    }

    public void adCarrinho(Produto produto) {
        produtos.add(produto);
    }

    public void remover(Produto produto) {
        produtos.remove(produto);
    }

    public void comprar(Produto produto) {
                if (user.getSaldo() >= produto.getPreco()) {
                    System.out.println("Compra realizada com sucesso!");
                    user.setSaldo(user.getSaldo() - produto.getPreco());
                    user.adHistorico(produto);
                    produtos.remove(produto);
                }else{
                    System.out.println("Saldo insuficiente!");
                }
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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
