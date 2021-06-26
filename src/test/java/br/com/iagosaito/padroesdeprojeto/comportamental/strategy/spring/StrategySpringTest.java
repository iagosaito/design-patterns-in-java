package br.com.iagosaito.padroesdeprojeto.comportamental.strategy.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class StrategySpringTest {

    @Autowired
    private ImpostoFactory impostoFactory;

    @Test
    void deveBuscarImpostoIcms() {
        final Imposto imposto = impostoFactory.buscarImposto(TipoImposto.ICMS);
        assertTrue(imposto instanceof Icms);
    }

    @Test
    void deveBuscarImpostoIss() {
        final Imposto imposto = impostoFactory.buscarImposto(TipoImposto.ISS);
        assertTrue(imposto instanceof Iss);
    }

    @Test
    void deveConterDuasStrategiasNaFabrica() {
        final int expectedStrategySize = 2;
        assertEquals(2, impostoFactory.getTiposDeImpostos().size());
    }
}
