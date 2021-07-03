package br.com.iagosaito.padroesdeprojeto.estrutural.facade;

import br.com.iagosaito.padroesdeprojeto.estruturais.facade.Conta;
import br.com.iagosaito.padroesdeprojeto.estruturais.facade.TransferenciaBancaria;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FacadeTest {

    @Test
    void deveRealizarUmaTransferenciaBancaria() {

        final long valorTransferencia = 2000;
        final Conta contaOrigem = Conta.builder().titular("Herbert Gonzaga").numero(1234).saldo(4000).build();
        final Conta contaDestino = Conta.builder().titular("Robert Plant").numero(12345).saldo(2000).build();

        TransferenciaBancaria transferenciaBancaria = new TransferenciaBancaria();
        transferenciaBancaria.executar(contaOrigem, contaDestino, valorTransferencia);

        assertThat(contaOrigem.getSaldo()).isEqualTo(2000);
        assertThat(contaDestino.getSaldo()).isEqualTo(4000);
    }
}
