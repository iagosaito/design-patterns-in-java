package br.com.iagosaito.padroesdeprojeto.chain_of_responsability.tradicional;

import br.com.iagosaito.padroesdeprojeto.chain_of_responsability.Orcamento;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public abstract class Desconto {

    protected Desconto proximoDesconto;

    public abstract BigDecimal calcular(Orcamento orcamento);
}
