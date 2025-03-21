package com.igorramos.ecommerce.store;

public class Produto {
    private String nome;
    private int id;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto:  " + getNome() + " / id: " + id + " /  R$" + preco + "";
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
