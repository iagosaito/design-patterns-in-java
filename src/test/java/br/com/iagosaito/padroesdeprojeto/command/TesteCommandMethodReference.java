package br.com.iagosaito.padroesdeprojeto.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteCommandMethodReference {

    @Test
    void deveAcenderEApagarLuz() {
        final Lampada lampada = new Lampada();

        final Switch lampadaSwitch = new Switch(lampada::acenderLuz, lampada::desligarLuz);

        lampadaSwitch.ligar();
        assertTrue(lampada.isLuz());
        lampada.desligarLuz();
        assertFalse(lampada.isLuz());
    }

    @Test
    void deveLigarEDesligarVentilador() {
        final Ventilador ventilador = new Ventilador();

        final Switch ventiladorSwitch = new Switch(ventilador::ligar, ventilador::desligar);

        ventiladorSwitch.ligar();
        assertTrue(ventilador.isLigado());
        ventiladorSwitch.desligar();
        assertFalse(ventilador.isLigado());
    }

}
