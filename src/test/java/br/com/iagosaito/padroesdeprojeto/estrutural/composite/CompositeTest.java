package br.com.iagosaito.padroesdeprojeto.estrutural.composite;

import br.com.iagosaito.padroesdeprojeto.estruturais.composite.DBA;
import br.com.iagosaito.padroesdeprojeto.estruturais.composite.Empresa;
import br.com.iagosaito.padroesdeprojeto.estruturais.composite.EngenheiroSoftware;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class CompositeTest {

    @Test
    void deveCalcularOCustoMensalDaEmpresa() {

        final Empresa empresa = new Empresa("Apple");

        // adicionando um DBA e um DEV na empresa
        final EngenheiroSoftware engIagoSaito = EngenheiroSoftware.builder()
                .nome("Iago Saito")
                .nivel(EngenheiroSoftware.Nivel.PLENO)
                .salario(new BigDecimal("6000.00"))
            .build();

        final DBA dbaMatias = DBA.builder()
                .nome("Matias")
                .nivel(DBA.Nivel.SENIOR)
                .salario(new BigDecimal("10000.00"))
            .build();

        empresa.adicionar(engIagoSaito);
        empresa.adicionar(dbaMatias);

        assertThat(empresa.custoMensal()).isEqualTo(new BigDecimal("16000.00"));

        // Adicionando uma empresa terceira
        final Empresa empresaTerceirizada = new Empresa("Terceira da Apple");

        // adicionando um DEV na empresa terceirizada
        final EngenheiroSoftware engTerceiro = EngenheiroSoftware.builder()
                .nome("Tertuliano")
                .nivel(EngenheiroSoftware.Nivel.SENIOR)
                .salario(new BigDecimal("15000.00"))
                .build();

        empresaTerceirizada.adicionar(engTerceiro);

        // adicionando empresa terceira
        empresa.adicionar(empresaTerceirizada);

        assertThat(empresa.custoMensal()).isEqualTo(new BigDecimal("31000.00"));
    }
}
