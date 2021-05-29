package br.com.iagosaito.padroesdeprojeto.chain_of_responsability.tradicional;

import br.com.iagosaito.padroesdeprojeto.chain_of_responsability.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

    /*
        Modelo incorreto -> Classe tende a crescer infinitamente
        public BigDecimal calcular(Orcamento orcamento) {

            if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
                return orcamento.getValor().multiply(new BigDecimal("0.1"));
            }

            if (orcamento.getItens() > 5) {
                return orcamento.getValor().multiply(new BigDecimal("0.05"));
            }

            return BigDecimal.ZERO;
        }
    */

    public BigDecimal calcular(Orcamento orcamento) {
        return new DescontoSobreValor(
                    new DescontoSobreItem(
                        new SemDesconto()
                )
        ).calcular(orcamento);
    }
}
