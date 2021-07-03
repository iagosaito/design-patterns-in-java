package br.com.iagosaito.padroesdeprojeto.estruturais.facade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class Conta {

    private String titular;
    private Integer numero;
    private long saldo;

    public boolean isSaldoDisponivelParaTransferencia(final long valorTransferencia) {
        return saldo >= valorTransferencia;
    }

    public void transferirPara(final Conta contaDestino, final long valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    private void depositar(final long valor) {
        this.saldo += valor;
    }

    private void sacar(final long valor) {
        this.saldo -= valor;
    }

}
