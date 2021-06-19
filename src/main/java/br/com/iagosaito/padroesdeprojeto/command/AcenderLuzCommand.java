package br.com.iagosaito.padroesdeprojeto.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AcenderLuzCommand implements Command {

    private final Lampada lampada;

    @Override
    public void execute() {
        lampada.acenderLuz();
    }
}
