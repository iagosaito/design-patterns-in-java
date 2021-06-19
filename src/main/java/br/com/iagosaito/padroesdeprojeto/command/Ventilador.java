package br.com.iagosaito.padroesdeprojeto.command;

import lombok.Getter;

@Getter
public class Ventilador {

    private boolean ligado;

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }
}
