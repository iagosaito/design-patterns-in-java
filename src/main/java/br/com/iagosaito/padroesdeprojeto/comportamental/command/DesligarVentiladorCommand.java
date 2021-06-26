package br.com.iagosaito.padroesdeprojeto.comportamental.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DesligarVentiladorCommand implements Command {

    private final Ventilador ventilador;

    @Override
    public void execute() {
        ventilador.desligar();
    }
}
