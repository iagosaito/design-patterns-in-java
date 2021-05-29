package br.com.iagosaito.padroesdeprojeto.chain_of_responsability.spring;

import br.com.iagosaito.padroesdeprojeto.chain_of_responsability.Orcamento;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class DescontoSobreItem extends Desconto {

    public BigDecimal calcular(Orcamento orcamento) {

        if (orcamento.getItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }

        return BigDecimal.ZERO;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
