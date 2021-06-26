package br.com.iagosaito.padroesdeprojeto.comportamental.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Switch {

    private final Command on, off;

    public void ligar() {
        on.execute();
    }

    public void desligar() {
        off.execute();
    }
}
