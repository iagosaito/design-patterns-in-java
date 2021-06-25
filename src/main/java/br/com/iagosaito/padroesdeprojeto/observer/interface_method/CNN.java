package br.com.iagosaito.padroesdeprojeto.observer.interface_method;

import org.springframework.stereotype.Component;

@Component
public class CNN implements Jornal {

    @Override
    public void atualizacaoDeNoticia(Noticia noticia) {
        System.out.println("CNN News: " + noticia);
    }
}
