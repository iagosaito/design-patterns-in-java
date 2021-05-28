package br.com.iagosaito.padroesdeprojeto.strategy.spring;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Component
@Getter
public class ImpostoFactory {

    private Map<TipoImposto, Imposto> tiposDeImpostos;

    @Autowired
    public ImpostoFactory(Set<Imposto> impostos) {
        tiposDeImpostos = new HashMap<>();
        impostos.forEach(imposto -> tiposDeImpostos.put(imposto.getTipoImposto(), imposto));
    }

    public Imposto buscarImposto(TipoImposto tipoImposto) {
        return tiposDeImpostos.get(tipoImposto);
    }
}
