package br.com.iagosaito.padroesdeprojeto.observer.interface_method;

import org.springframework.stereotype.Component;

@Component
public class JornalHoje implements Jornal {

    @Override
    public void atualizacaoDeNoticia(Noticia noticia) {
        System.out.println("Jornal Hoje: " + noticia);
    }
}
