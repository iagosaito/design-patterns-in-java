package br.com.iagosaito.padroesdeprojeto.comportamental.chain_of_responsability.spring;

import br.com.iagosaito.padroesdeprojeto.comportamental.chain_of_responsability.Orcamento;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ChainOfResponsabilityTest {

    @Autowired
    private CalculadoraDeDescontoSpring descontoSpring;

    @Test
    void deveAplicarDescontoSobreValor() {
        final BigDecimal descontoEsperado = new BigDecimal("60.0");
        final Orcamento orcamento = new Orcamento(new BigDecimal("600"), 1);
        final BigDecimal valorDesconto = descontoSpring.calcular(orcamento);

        assertEquals(descontoEsperado, valorDesconto);
    }

    @Test
    void deveAplicarDescontoSobreQuantidade() {
        final BigDecimal descontoEsperado = new BigDecimal("2.50");
        final Orcamento orcamento = new Orcamento(new BigDecimal("50"), 6);
        final BigDecimal valorDesconto = descontoSpring.calcular(orcamento);

        assertEquals(descontoEsperado, valorDesconto);
    }

    @Test
    void deveObedecerPrioridadeDeDesconto() {
        final BigDecimal descontoEsperado = new BigDecimal("50.00");
        final Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 6);
        final BigDecimal valorDesconto = descontoSpring.calcular(orcamento);

        assertEquals(descontoEsperado, valorDesconto);
    }
}
