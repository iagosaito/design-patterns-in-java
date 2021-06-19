package br.com.iagosaito.padroesdeprojeto.command;

import lombok.Getter;

@Getter
public class Lampada {

    private boolean luz;

    public void acenderLuz() {
        luz = true;
    }

    public void desligarLuz() {
        luz = false;
    }

}
