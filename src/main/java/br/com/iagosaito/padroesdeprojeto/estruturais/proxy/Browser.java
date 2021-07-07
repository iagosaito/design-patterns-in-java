package br.com.iagosaito.padroesdeprojeto.estruturais.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Browser implements FornecedorInternet{

    @Override
    public String acessarSite(final String url) {
        try {
            Thread.sleep(5000);
            log.info("Fazendo requisição para {}...", url);
            return "Dados do site...";
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        throw new RuntimeException("Erro ao buscar dados do site");
    }
}
