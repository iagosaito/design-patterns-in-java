package br.com.iagosaito.padroesdeprojeto.estruturais.proxy;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class InternetProxy extends Proxy implements FornecedorInternet {

    private final Browser browser;
    private Map<String, String> dadosDoSiteCache = new HashMap<>();

    public InternetProxy(final Browser browser) {
        this.browser = browser;
    }

    @Override
    public String acessarSite(final String url) {
        if (dadosDoSiteCache.containsKey(url)) {
            log.info("Utilizando cache para URL {}", url);
            return dadosDoSiteCache.get(url);
        }

        final String dadosDoSite = browser.acessarSite(url);
        dadosDoSiteCache.put(url, dadosDoSite);

        return dadosDoSite;
    }
}
