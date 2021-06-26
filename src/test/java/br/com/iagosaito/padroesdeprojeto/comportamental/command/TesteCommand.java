package br.com.iagosaito.padroesdeprojeto.comportamental.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteCommand {

    @Test
    void deveAcenderEApagarLuz() {
        final Lampada lampada = new Lampada();

        final AcenderLuzCommand acenderLuzCommand = new AcenderLuzCommand(lampada);
        final ApagarLuzCommand apagarLuzCommand = new ApagarLuzCommand(lampada);

        final Switch lampadaSwitch = new Switch(acenderLuzCommand, apagarLuzCommand);

        lampadaSwitch.ligar();
        assertTrue(lampada.isLuz());
        lampada.desligarLuz();
        assertFalse(lampada.isLuz());
    }

    @Test
    void deveLigarEDesligarVentilador() {
        final Ventilador ventilador = new Ventilador();

        final LigarVentiladorCommand ligarVentiladorCommand = new LigarVentiladorCommand(ventilador);
        final DesligarVentiladorCommand desligarVentiladorCommand = new DesligarVentiladorCommand(ventilador);

        final Switch ventiladorSwitch = new Switch(ligarVentiladorCommand, desligarVentiladorCommand);

        ventiladorSwitch.ligar();
        assertTrue(ventilador.isLigado());
        ventiladorSwitch.desligar();
        assertFalse(ventilador.isLigado());
    }

}
