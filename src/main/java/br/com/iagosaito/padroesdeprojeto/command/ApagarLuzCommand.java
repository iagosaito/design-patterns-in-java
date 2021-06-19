package br.com.iagosaito.padroesdeprojeto.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ApagarLuzCommand implements Command {

    private final Lampada lampada;

    @Override
    public void execute() {
        lampada.desligarLuz();
    }
}
