package br.com.iagosaito.padroesdeprojeto.estruturais.composite;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class DBA implements Empregado {

    private String nome;
    private Nivel nivel;
    private BigDecimal salario;

    @Override
    public void mostrarDados() {
        System.out.println("DBA " + nome + ", nível: " + nivel);
    }

    @Override
    public BigDecimal custoMensal() {
        return this.salario;
    }

    public enum Nivel {
        JUNIOR, PLENO, SENIOR
    }
}
