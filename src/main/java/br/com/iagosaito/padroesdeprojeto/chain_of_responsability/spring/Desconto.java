package br.com.iagosaito.padroesdeprojeto.chain_of_responsability.spring;

import br.com.iagosaito.padroesdeprojeto.chain_of_responsability.Orcamento;
import org.springframework.core.Ordered;

import java.math.BigDecimal;

public abstract class Desconto implements Ordered {
    public abstract BigDecimal calcular(Orcamento orcamento);
}
