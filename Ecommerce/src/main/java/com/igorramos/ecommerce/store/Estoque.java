package com.igorramos.ecommerce.store;

import java.util.HashMap;
import java.util.Map;

public class Estoque {

    private Map<Integer, Integer> produtos;

    public Estoque() {
        this.produtos = new HashMap<>();
    } 
    
    public boolean verificarEstoque(int id, int quantidade){
           return produtos.getOrDefault(id, 0) >= quantidade;
    }

    public void adProduto(int id, int quantidade) {
        produtos.put(id, produtos.getOrDefault(id, 0) + quantidade);
    }

    public void removerProduto(int id, int quantidade) {
        if(verificarEstoque(id, quantidade)){
            produtos.put(id, produtos.get(id) - quantidade);
        }
        
    }

    public int verificarEstoque(Produto produto) {
        return produtos.getOrDefault(produto, 0);
    }

    public Map<Integer, Integer> getProdutos() {
        return produtos;
    }

    public void setProdutos(Map<Integer, Integer> produtos) {
        this.produtos = produtos;
    }

    
    
}
