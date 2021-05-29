package br.com.iagosaito.padroesdeprojeto.chain_of_responsability.tradicional;

import br.com.iagosaito.padroesdeprojeto.chain_of_responsability.Orcamento;

import java.math.BigDecimal;

public class DescontoSobreItem extends Desconto {

    public DescontoSobreItem(Desconto proximoDesconto) {
        super(proximoDesconto);
    }

    public BigDecimal calcular(Orcamento orcamento) {

        if (orcamento.getItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }

        return proximoDesconto.calcular(orcamento);
    }
}
