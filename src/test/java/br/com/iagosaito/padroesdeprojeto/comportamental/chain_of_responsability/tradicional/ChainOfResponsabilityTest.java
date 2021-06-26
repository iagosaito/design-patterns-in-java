package br.com.iagosaito.padroesdeprojeto.comportamental.chain_of_responsability.tradicional;

import br.com.iagosaito.padroesdeprojeto.comportamental.chain_of_responsability.Orcamento;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChainOfResponsabilityTest {

    @Test
    void deveDarCincoPorCentoDeDescontoParaVendasComMaisDeCincoItens() {
        final BigDecimal valorDescontoEsperado = new BigDecimal("2.50");

        final Orcamento orcamento = new Orcamento(new BigDecimal("50"), 6);
        BigDecimal valorDesconto = new CalculadoraDeDesconto().calcular(orcamento);

        assertEquals(valorDescontoEsperado, valorDesconto);
    }

    @Test
    void deveDarDezPorCentoDeDescontoParaVendasComValorMaiorQueQuinhentosReais() {
        final BigDecimal valorDescontoEsperado = new BigDecimal("100.0");

        final Orcamento orcamento = new Orcamento(new BigDecimal("1000"), 1);
        BigDecimal valorDesconto = new CalculadoraDeDesconto().calcular(orcamento);

        assertEquals(valorDescontoEsperado, valorDesconto);
    }
}
