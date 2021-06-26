package br.com.iagosaito.padroesdeprojeto.comportamental.strategy.tradicional;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    // Problema: A cada imposto novo precisaremos adicionar mais uma validação
    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {

        if (tipoImposto.equals(TipoImposto.ISS)) {
            return orcamento.getValor().multiply(new BigDecimal("0.8"));
        } else if (tipoImposto.equals(TipoImposto.ICMS)) {
            return orcamento.getValor().multiply(new BigDecimal("0.6"));
        }

        return null;
    }

    // Solução
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento.getValor());
    }
}
