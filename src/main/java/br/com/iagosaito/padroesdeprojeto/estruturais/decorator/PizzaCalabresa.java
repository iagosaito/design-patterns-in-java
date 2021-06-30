package br.com.iagosaito.padroesdeprojeto.estruturais.decorator;

import java.math.BigDecimal;

public class PizzaCalabresa implements Pizza {

    private static final BigDecimal PRECO_CALABRESA = BigDecimal.TEN;

    @Override
    public BigDecimal valor() {
        return PRECO_CALABRESA;
    }

    @Override
    public String getDescricao() {
        return "Calabresa acebolada muito top";
    }
}
