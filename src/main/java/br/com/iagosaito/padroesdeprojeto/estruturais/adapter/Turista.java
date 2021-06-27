package br.com.iagosaito.padroesdeprojeto.estruturais.adapter;

import lombok.Getter;

@Getter
public class Turista {

    private final Bicicleta bicicleta;

    public Turista(final Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public void pedalar() {
        bicicleta.pedalar();
    }
}
