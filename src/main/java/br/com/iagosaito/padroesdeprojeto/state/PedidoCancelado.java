package br.com.iagosaito.padroesdeprojeto.state;

import org.springframework.stereotype.Component;

@Component
public class PedidoCancelado extends StatusPedido {

    @Override
    public void printStatus(long pedidoId) {
        System.out.printf("Pedido de id %d foi cancelado", pedidoId);
    }

}
