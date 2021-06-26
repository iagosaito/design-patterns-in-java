package br.com.iagosaito.padroesdeprojeto.comportamental.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StateTest {

    private static final String ERR_MSG_PEDIDO_CANCELADO = "Pedido de ID %d não pode ser cancelado";
    private static final String ERR_MSG_PEDIDO_ENTREGUE = "Pedido de ID %s não pode ser entregue";
    private Pedido pedido;

    @BeforeEach
    void criarPedido() {
        pedido = new Pedido(1);
    }

    @Test
    void deveConfirmarPagamento() {
        pedido.confirmarPagamento();
        assertThat(pedido.getStatusPedido()).isInstanceOf(PagamentoConfirmado.class);
    }

    @Test
    void deveDespacharPedido() {
        pedido.confirmarPagamento();
        pedido.despachar();
        assertThat(pedido.getStatusPedido()).isInstanceOf(PedidoDespachado.class);
    }

    @Test
    void deveEntregarPedido() {
        pedido.confirmarPagamento();
        pedido.despachar();
        pedido.entregar();
        assertThat(pedido.getStatusPedido()).isInstanceOf(PedidoEntregue.class);
    }

    @Test
    void deveCancelarPedido() {
        pedido.cancelar();
        assertThat(pedido.getStatusPedido()).isInstanceOf(PedidoCancelado.class);
    }

    @Test
    void deveFalharAoCancelarPedidoEntregue() {
        pedido.confirmarPagamento();
        pedido.despachar();
        pedido.entregar();

        try {
            pedido.cancelar();
        } catch (Exception ex) {
            assertThat(ex).hasMessage(String.format("Pedido de ID %d não pode ser cancelado", pedido.getId()));
        }
    }

    @Test
    void deveFalharAoCancelarPedidoDespachado() {
        pedido.confirmarPagamento();
        pedido.despachar();

        try {
            pedido.cancelar();
        } catch (Exception ex) {
            assertThat(ex).hasMessage(String.format(ERR_MSG_PEDIDO_CANCELADO, pedido.getId()));
        }
    }

    @Test
    void deveFalharAoEntregarPedidoNaoDespachado() {

        try {
            pedido.entregar();
        } catch (Exception ex) {
            assertThat(ex).hasMessage(String.format(ERR_MSG_PEDIDO_ENTREGUE, pedido.getId()));
        }

    }
}
