package br.com.iagosaito.padroesdeprojeto.state;

import org.springframework.stereotype.Component;

@Component
public class PedidoEntregue extends StatusPedido {

    @Override
    public void printStatus(long pedidoId) {
        System.out.printf("Pedido de ID %d foi entregue com sucesso", pedidoId);
    }
}
