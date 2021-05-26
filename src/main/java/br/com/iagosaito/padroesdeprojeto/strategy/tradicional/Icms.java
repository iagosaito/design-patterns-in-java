package br.com.iagosaito.padroesdeprojeto.strategy.tradicional;

import java.math.BigDecimal;

public class Icms implements Imposto {

    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(new BigDecimal("0.1"));
    }
}
