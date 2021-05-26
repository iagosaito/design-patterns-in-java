package br.com.iagosaito.padroesdeprojeto.strategy.tradicional;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(BigDecimal valor);
}
