package br.com.iagosaito.padroesdeprojeto.estruturais.decorator;

import java.math.BigDecimal;

public class PizzaCalabresaComMussarela implements Pizza {

    private static final BigDecimal PRECO_CALABRESA_COM_MUSSARELA = BigDecimal.TEN.add(BigDecimal.TEN);

    @Override
    public BigDecimal valor() {
        return PRECO_CALABRESA_COM_MUSSARELA;
    }
}
