package br.com.iagosaito.padroesdeprojeto.state;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PagamentoPendente extends StatusPedido {

    @Override
    public void printStatus(long pedidoId) {
        System.out.printf("Aguardando pagamento do Pedido de id %d", pedidoId);
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setStatusPedido(new PedidoCancelado());
    }

    @Override
    public void confirmarPagamento(Pedido pedido) {
        pedido.setStatusPedido(new PagamentoConfirmado());
    }
}
