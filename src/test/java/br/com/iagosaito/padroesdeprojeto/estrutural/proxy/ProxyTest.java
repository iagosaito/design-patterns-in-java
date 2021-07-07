package br.com.iagosaito.padroesdeprojeto.estrutural.proxy;

import br.com.iagosaito.padroesdeprojeto.estruturais.proxy.Browser;
import br.com.iagosaito.padroesdeprojeto.estruturais.proxy.InternetProxy;
import br.com.iagosaito.padroesdeprojeto.estruturais.proxy.SecurityProxy;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;

public class ProxyTest {

    private static final String GOOGLE_URL = "www.google.com";
    private static final String YOUTUBE_URL = "www.youtube.com";

    @Test
    void deveBloquearAcessoAoUsuarioNaoAdmin() {
        final Browser browser = new Browser();
        final SecurityProxy securityProxy = new SecurityProxy(browser, "admin", "admin");

        final Throwable exception = catchThrowable(() -> securityProxy.acessarSite(YOUTUBE_URL));

        assertThat(exception)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Acesso bloquado");
    }

    @Test
    void deveLiberarAcessoAoUsuarioAdmin() {
        final Browser browser = new Browser();
        final SecurityProxy securityProxy = new SecurityProxy(browser, "admin", "senha");

        final Throwable exception = catchThrowable(() -> securityProxy.acessarSite(YOUTUBE_URL));

        assertThat(exception).isNull();
    }

    @Test
    void deveUtilizarCacheAoRepetirRequisicao() {
        final Browser browser = new Browser();
        final InternetProxy internetProxy = new InternetProxy(browser);

        internetProxy.acessarSite(GOOGLE_URL);
        internetProxy.acessarSite(GOOGLE_URL);
    }

}
