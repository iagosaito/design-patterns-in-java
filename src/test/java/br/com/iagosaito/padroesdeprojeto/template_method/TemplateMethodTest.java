package br.com.iagosaito.padroesdeprojeto.template_method;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TemplateMethodTest {

    @Autowired
    private ReceitaArroz receitaArroz;

    @Autowired
    private ReceitaMacarrao receitaMacarrao;

    @Test
    void deveRetornarReceitaDeGrao() {
        final Receita receita = receitaArroz.criarReceita();

        assertEquals(receita.getTiposDeReceita(), TiposDeReceita.GRAO);
    }

    @Test
    void deveRetornarReceitaDePasta() {
        final Receita receita = receitaMacarrao.criarReceita();

        assertEquals(receita.getTiposDeReceita(), TiposDeReceita.PASTA);
    }
}
