package br.com.iagosaito.padroesdeprojeto.estruturais.decorator;

import java.math.BigDecimal;

public interface Pizza {

    BigDecimal valor();

    default String getDescricao() {
        return "Basic Pizza";
    }

}
