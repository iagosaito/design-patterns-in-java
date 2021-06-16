package br.com.iagosaito.padroesdeprojeto.state;

import lombok.Data;

@Data
public class Pedido {

    private long id;
    private StatusPedido statusPedido = new PagamentoPendente();

    public Pedido(long id) {
        this.id = id;
    }

    public void printStatus() {
        statusPedido.printStatus(id);
    }

    public void cancelar() {
        this.statusPedido.cancelar(this);
    }

    public void despachar() {
        this.statusPedido.despachar(this);
    }

    public void entregar() {
        this.statusPedido.entregarAoDestinatario(this);
    }

    public void confirmarPagamento() {
        this.statusPedido.confirmarPagamento(this);
    }

}
