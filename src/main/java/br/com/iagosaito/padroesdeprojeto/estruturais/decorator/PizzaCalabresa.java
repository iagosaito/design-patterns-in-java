package br.com.iagosaito.padroesdeprojeto.estruturais.decorator;

import java.math.BigDecimal;

public class PizzaCalabresa extends SaborPizza {

    public PizzaCalabresa(final Pizza pizza) {
        this.pizza = pizza;
    }

    private static final BigDecimal PRECO_CALABRESA = BigDecimal.TEN;

    @Override
    public BigDecimal valor() {
        return PRECO_CALABRESA;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " e calabresa acebolada muito top";
    }
}
