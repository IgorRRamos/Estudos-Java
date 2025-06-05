package com.igorramos.ecommerce.store;

public class Pagamento {
    private Carrinho carrinho;
    private String metodoPagamento;
    private boolean pago;

    public Pagamento(Carrinho carrinho, String metodoPagamento) {
        this.carrinho = carrinho;
        this.metodoPagamento = metodoPagamento;
        this.pago = false;
    }
    
    public boolean comprar(){
        double total = carrinho.calcularTotal();
        
        if(carrinho.getProdutos().isEmpty()){
                System.out.println("Compra não pode ser realizada com o carrinho vazio.");
                return false;
        }
        if(carrinho.getUser().getSaldo() < total){
            System.out.println("Saldo insuficiente!");
            return false;
        }
        
        carrinho.getUser().setSaldo(carrinho.getUser().getSaldo() - total);
        
        Pedido pedido = new Pedido(carrinho.getUser(), carrinho.getProdutos());
        
        carrinho.getUser().adHistorico(pedido);
        
        carrinho.limparCarrinho();
        
        this.pago = true;
        System.out.println("Compra realizada com sucesso! " + metodoPagamento);
        return true;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
