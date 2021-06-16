package br.com.iagosaito.padroesdeprojeto.state;

public abstract class StatusPedido {

    public abstract void printStatus(long pedidoId);

    public void cancelar(final Pedido pedido) {
        throw new RuntimeException(String.format("Pedido de ID %d não pode ser cancelado", pedido.getId()));
    }

    public void confirmarPagamento(final Pedido pedido) {
        throw new RuntimeException(String.format("Pedido de ID %d não teve seu pagamento confirmado", pedido.getId()));
    }

    public void despachar(final Pedido pedido) {
        throw new RuntimeException(String.format("Pedido de ID %d não pode ser despachado", pedido.getId()));
    }

    public void entregarAoDestinatario(final Pedido pedido) {
        throw new RuntimeException(String.format("Pedido de ID %d não pode ser entregue", pedido.getId()));
    }
}
