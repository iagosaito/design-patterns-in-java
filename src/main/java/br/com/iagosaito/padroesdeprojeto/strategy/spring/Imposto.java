package br.com.iagosaito.padroesdeprojeto.strategy.spring;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(BigDecimal valor);

    TipoImposto getTipoImposto();
}
