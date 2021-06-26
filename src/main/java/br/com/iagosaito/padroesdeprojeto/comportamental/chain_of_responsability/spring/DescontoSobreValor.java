package br.com.iagosaito.padroesdeprojeto.comportamental.chain_of_responsability.spring;

import br.com.iagosaito.padroesdeprojeto.comportamental.chain_of_responsability.Orcamento;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class DescontoSobreValor extends Desconto {

    public BigDecimal calcular(Orcamento orcamento) {

        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return BigDecimal.ZERO;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
