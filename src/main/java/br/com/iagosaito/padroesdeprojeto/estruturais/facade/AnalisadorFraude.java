package br.com.iagosaito.padroesdeprojeto.estruturais.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AnalisadorFraude {

    public void executa(final Conta conta, long valor) {
        log.info("Executando análise de fraude para a conta {} a partir de uma transferência de {}",
                conta.getTitular(), valor);
    }

}
