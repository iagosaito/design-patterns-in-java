package br.com.iagosaito.padroesdeprojeto.template_method;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ReceitaMacarrao extends ConstrutorDeReceita {

    @Override
    protected List<String> definirIngredientes() {
        return Arrays.asList("Pasta", "Agua", "Sal");
    }

    @Override
    protected List<String> definirModoDePreparo() {
        return Arrays.asList("Agua Fervendo", "Salgar como água do mar", "Colocar macarrão");
    }

    @Override
    protected String comoServir() {
        return "Dentro de uma travessa de vidro";
    }

    @Override
    protected TiposDeReceita getTipoReceita() {
        return TiposDeReceita.PASTA;
    }
}
