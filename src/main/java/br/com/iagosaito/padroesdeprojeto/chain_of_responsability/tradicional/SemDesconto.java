package br.com.iagosaito.padroesdeprojeto.chain_of_responsability.tradicional;

import br.com.iagosaito.padroesdeprojeto.chain_of_responsability.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
