package br.com.iagosaito.padroesdeprojeto.state;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PagamentoConfirmado extends StatusPedido {


    @Override
    public void printStatus(long pedidoId) {
        System.out.printf("Pedido de ID %d foi pago com sucesso!", pedidoId);
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setStatusPedido(new PedidoCancelado());
    }

    @Override
    public void despachar(Pedido pedido) {
        pedido.setStatusPedido(new PedidoDespachado());
    }
}
