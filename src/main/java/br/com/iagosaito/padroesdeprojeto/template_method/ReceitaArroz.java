package br.com.iagosaito.padroesdeprojeto.template_method;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ReceitaArroz extends ConstrutorDeReceita {

    @Override
    protected List<String> definirIngredientes() {
        return Arrays.asList("Arroz", "Agua", "Azeite", "Alho");
    }

    @Override
    protected List<String> definirModoDePreparo() {
        return Arrays.asList("Refogar alho", "Inserir Arroz");
    }

    @Override
    protected String comoServir() {
        return "Diretamente na panela";
    }

    @Override
    protected TiposDeReceita getTipoReceita() {
        return TiposDeReceita.GRAO;
    }
}
