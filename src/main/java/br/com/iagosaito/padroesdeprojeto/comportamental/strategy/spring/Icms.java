package br.com.iagosaito.padroesdeprojeto.comportamental.strategy.spring;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Icms implements Imposto {

    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(new BigDecimal("0.4"));
    }

    @Override
    public TipoImposto getTipoImposto() {
        return TipoImposto.ICMS;
    }
}
