package br.com.iagosaito.padroesdeprojeto.comportamental.strategy.tradicional;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(BigDecimal valor);
}
