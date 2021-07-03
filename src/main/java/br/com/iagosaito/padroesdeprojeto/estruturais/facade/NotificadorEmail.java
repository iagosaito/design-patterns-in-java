package br.com.iagosaito.padroesdeprojeto.estruturais.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NotificadorEmail {

    public void notificar(final String nomeCliente) {
      log.info("Notificando cliente {} ... ", nomeCliente);
    }
}
