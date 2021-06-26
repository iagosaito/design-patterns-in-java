package br.com.iagosaito.padroesdeprojeto.comportamental.template_method;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Getter
public class Receita {

    private final List<String> ingredientes;
    private final List<String> modoDePreparo;
    private final String comoServir;
    private final TiposDeReceita tiposDeReceita;

}
