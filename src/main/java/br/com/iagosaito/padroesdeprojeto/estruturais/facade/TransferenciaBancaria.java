package br.com.iagosaito.padroesdeprojeto.estruturais.facade;

public class TransferenciaBancaria {

    private final NotificadorEmail notificadorEmail;
    private final AnalisadorFraude analisadorFraude;

    public TransferenciaBancaria() {
        this.analisadorFraude = new AnalisadorFraude();
        this.notificadorEmail = new NotificadorEmail();
    }

    /*
        Cria uma fachada para encapsular a lógica de transferencia para o cliente
     */
    public void executar(final Conta contaOrigem, final Conta contaDestino, final long valor) {
        analisadorFraude.executa(contaOrigem, valor);

        if (contaOrigem.isSaldoDisponivelParaTransferencia(valor)) {
            contaOrigem.transferirPara(contaDestino, valor);
        }

        notificadorEmail.notificar(contaOrigem.getTitular());
        notificadorEmail.notificar(contaDestino.getTitular());
    }
}
