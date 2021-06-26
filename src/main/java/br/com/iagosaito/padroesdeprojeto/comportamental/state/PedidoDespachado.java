package br.com.iagosaito.padroesdeprojeto.comportamental.state;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PedidoDespachado extends StatusPedido {

    @Override
    public void printStatus(long pedidoId) {
        System.out.printf("Pedido de id %d foi despachado%n", pedidoId);
    }

    @Override
    public void entregarAoDestinatario(Pedido pedido) {
        pedido.setStatusPedido(new PedidoEntregue());
    }

}
