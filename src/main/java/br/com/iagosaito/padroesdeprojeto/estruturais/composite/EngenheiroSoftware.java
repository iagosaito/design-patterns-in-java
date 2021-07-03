package br.com.iagosaito.padroesdeprojeto.estruturais.composite;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.math.BigDecimal;

@AllArgsConstructor
@Builder
public class EngenheiroSoftware implements Empregado {

    private String nome;
    private Nivel nivel;
    private BigDecimal salario;

    @Override
    public void mostrarDados() {
        System.out.println("Eng " + nome + ", nível: " + nivel);
    }

    @Override
    public BigDecimal custoMensal() {
        return this.salario;
    }

    public enum Nivel {
        JUNIOR, PLENO, SENIOR
    }
}
