package br.com.iagosaito.padroesdeprojeto.comportamental.chain_of_responsability;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class Orcamento {

    private BigDecimal valor;
    private int itens;

}
