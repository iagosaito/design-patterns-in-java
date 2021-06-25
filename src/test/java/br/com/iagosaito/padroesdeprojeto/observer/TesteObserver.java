package br.com.iagosaito.padroesdeprojeto.observer;

import br.com.iagosaito.padroesdeprojeto.observer.interface_method.AgenciaDeNoticias;
import br.com.iagosaito.padroesdeprojeto.observer.interface_method.Noticia;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TesteObserver {

    @Autowired
    private AgenciaDeNoticias agenciaDeNoticias;

    @Test
    void deveAtualizarNoticiaEmTodosOsJornais() {

        final Noticia noticia = new Noticia();
        noticia.setTitulo("Flamengo anuncia a contratação de Mancuello");
        noticia.setTipoNoticia(Noticia.TipoNoticia.ESPORTE);
        noticia.setCorpoNoticia("Flamengo anuncia a contratação do meio campista Mancuello por 15 milhões de reais");

        agenciaDeNoticias.publicarNoticia(noticia);
    }
}
