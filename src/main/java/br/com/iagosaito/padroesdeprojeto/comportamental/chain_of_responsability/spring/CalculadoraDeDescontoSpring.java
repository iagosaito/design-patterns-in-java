package br.com.iagosaito.padroesdeprojeto.comportamental.chain_of_responsability.spring;

import br.com.iagosaito.padroesdeprojeto.comportamental.chain_of_responsability.Orcamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.List;

@Component
public class CalculadoraDeDescontoSpring {

    @Autowired
    private List<Desconto> tiposDeDesconto;

    @PostConstruct
    private void initDescontoChainPattern() {
        tiposDeDesconto.sort(AnnotationAwareOrderComparator.INSTANCE);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        for (Desconto desconto : tiposDeDesconto) {
            final BigDecimal valorDesconto = desconto.calcular(orcamento);

            if (valorDesconto.compareTo(BigDecimal.ZERO) > 0) {
                return valorDesconto;
            }

        }

        return BigDecimal.ZERO;
    }
}
