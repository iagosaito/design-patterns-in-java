package br.com.iagosaito.padroesdeprojeto.estruturais.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Caicara implements Bicicleta {

    @Override
    public void pedalar() {
      log.info("Pedalando de caiçara na praia...");
    }

}
