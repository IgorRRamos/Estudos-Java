package com.igorramos.ecommerce.users;
import com.igorramos.ecommerce.store.Pedido;
import com.igorramos.ecommerce.store.Produto;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<Pedido> historico;
    private String nome;
    private int id;
    private double saldo;

    public Usuario(int id, String nome, double saldo) {
        this.nome = nome;
        this.id = id;
        this.saldo = saldo;
        this.historico = new ArrayList<>();
    }
    
    public void adHistorico(Pedido p){
        historico.add(p);
    }
    
    public void adicionarSaldo(double deposito){
        setSaldo(getSaldo() + deposito);
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }     
}
