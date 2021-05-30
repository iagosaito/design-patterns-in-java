package br.com.iagosaito.padroesdeprojeto.template_method;

import java.util.List;

public abstract class ConstrutorDeReceita {

    protected final Receita criarReceita() {
        final List<String> ingredientes = definirIngredientes();
        final List<String> modoDePreparo = definirModoDePreparo();
        final String comoServir = comoServir();

        return new Receita(ingredientes, modoDePreparo, comoServir, getTipoReceita());
    }

    protected abstract List<String> definirIngredientes();
    protected abstract List<String> definirModoDePreparo();
    protected abstract String comoServir();

    protected abstract TiposDeReceita getTipoReceita();
}
