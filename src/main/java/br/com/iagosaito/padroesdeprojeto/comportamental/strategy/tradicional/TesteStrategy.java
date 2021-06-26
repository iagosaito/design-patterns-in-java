package br.com.iagosaito.padroesdeprojeto.comportamental.strategy.tradicional;

import java.math.BigDecimal;

public class TesteStrategy {

    public static void main(String[] args) {

        final Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        final BigDecimal totalImposto = calculadoraDeImpostos.calcular(orcamento, TipoImposto.ISS);

        System.out.println(totalImposto);

        // Mesmo teste com a implementação do Strategy
        final BigDecimal totalImpostoStrategy = calculadoraDeImpostos.calcular(orcamento, new Iss());
        System.out.println(totalImpostoStrategy);

    }
}
