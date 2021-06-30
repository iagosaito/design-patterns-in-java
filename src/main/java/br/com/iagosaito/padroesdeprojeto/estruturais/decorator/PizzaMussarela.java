package br.com.iagosaito.padroesdeprojeto.estruturais.decorator;

import java.math.BigDecimal;

public class PizzaMussarela implements Pizza {

    private static final BigDecimal PRECO_MUSSARELA = new BigDecimal("8.00");

    @Override
    public BigDecimal valor() {
        return PRECO_MUSSARELA;
    }

    @Override
    public String getDescricao() {
        return "Mussarela recheada";
    }
}
