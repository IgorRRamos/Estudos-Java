package com.igorramos.ecommerce;

import com.igorramos.ecommerce.store.Carrinho;
import com.igorramos.ecommerce.store.Estoque;
import com.igorramos.ecommerce.store.Pagamento;
import com.igorramos.ecommerce.store.Pedido;
import com.igorramos.ecommerce.store.Produto;
import com.igorramos.ecommerce.users.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ecommerce {
    static Usuario cliente = new Usuario(1, "igor", 5000);
    static Carrinho carrinho = new Carrinho(cliente);
    static Estoque estoque = new Estoque();
    
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Monitor", 500);
        Produto produto2 = new Produto(1, "Cpu", 1000);
        Produto produto3 = new Produto(1, "Mouse", 150);
        Produto produto4 = new Produto(1, "Teclado", 300);
        Produto produto5 = new Produto(1, "Fone", 250);
     
        
        estoque.adProduto(produto1.getId(), 10);
        estoque.adProduto(produto2.getId(), 10);
        estoque.adProduto(produto3.getId(), 10);
        estoque.adProduto(produto4.getId(), 10);
        estoque.adProduto(produto5.getId(), 10);
        
        carrinho.adCarrinho(produto1, estoque);
        carrinho.adCarrinho(produto2, estoque);
        
        Pagamento pay = new Pagamento(carrinho, "Dinheiro");
    
    }
}
