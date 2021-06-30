package br.com.iagosaito.padroesdeprojeto.estrutural.decorator;

import br.com.iagosaito.padroesdeprojeto.estruturais.decorator.Pizza;
import br.com.iagosaito.padroesdeprojeto.estruturais.decorator.PizzaCalabresa;
import br.com.iagosaito.padroesdeprojeto.estruturais.decorator.PizzaMussarela;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    void deveCriarUmaPizzaDeCalabresaComMussarela() {
        final Pizza pizza = new PizzaCalabresa(new PizzaMussarela(null));
        System.out.println(pizza.getDescricao());
    }
}
