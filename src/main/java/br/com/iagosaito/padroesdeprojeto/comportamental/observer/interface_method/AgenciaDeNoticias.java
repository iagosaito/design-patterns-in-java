package br.com.iagosaito.padroesdeprojeto.comportamental.observer.interface_method;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class AgenciaDeNoticias {

    @Autowired
    private final Set<Jornal> jornais = new HashSet<>();

    public void publicarNoticia(final Noticia noticia) {
        jornais.forEach(jornal -> jornal.atualizacaoDeNoticia(noticia));
    }
}
