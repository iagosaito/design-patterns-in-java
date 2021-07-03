package br.com.iagosaito.padroesdeprojeto.estruturais.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpresaTerceira implements Empregado {

    private final String nome;
    private final List<Empregado> empregados;

    public EmpresaTerceira(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }

    @Override
    public void mostrarDados() {
        System.out.println(nome + " é uma empresa terceira");
    }

    @Override
    public BigDecimal custoMensal() {
        return empregados.stream().reduce(BigDecimal.ZERO, (subtotal, element) ->
                element.custoMensal().add(subtotal), BigDecimal::add);
    }

    public void adicionar(final Empregado empregado) {
        this.empregados.add(empregado);
    }

    public void remover(final Empregado empregado) {
        this.empregados.remove(empregado);
    }

    public List<Empregado> getEmpregados() {
        return Collections.unmodifiableList(this.empregados);
    }

}
