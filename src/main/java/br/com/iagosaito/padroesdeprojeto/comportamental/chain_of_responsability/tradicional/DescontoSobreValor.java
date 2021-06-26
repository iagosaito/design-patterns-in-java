package br.com.iagosaito.padroesdeprojeto.comportamental.chain_of_responsability.tradicional;

import br.com.iagosaito.padroesdeprojeto.comportamental.chain_of_responsability.Orcamento;

import java.math.BigDecimal;

public class DescontoSobreValor extends Desconto {

    public DescontoSobreValor(Desconto proximoDesconto) {
        super(proximoDesconto);
    }

    public BigDecimal calcular(Orcamento orcamento) {

        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return proximoDesconto.calcular(orcamento);
    }
}
