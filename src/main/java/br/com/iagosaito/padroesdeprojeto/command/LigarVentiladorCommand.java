package br.com.iagosaito.padroesdeprojeto.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LigarVentiladorCommand implements Command {

    private final Ventilador ventilador;

    @Override
    public void execute() {
        ventilador.ligar();
    }
}
