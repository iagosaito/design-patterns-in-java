package br.com.iagosaito.padroesdeprojeto.strategy.spring;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Iss implements Imposto {

    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(new BigDecimal("0.8"));
    }

    @Override
    public TipoImposto getTipoImposto() {
        return TipoImposto.ISS;
    }
}
