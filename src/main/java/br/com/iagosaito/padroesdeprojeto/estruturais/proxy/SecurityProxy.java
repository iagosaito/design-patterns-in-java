package br.com.iagosaito.padroesdeprojeto.estruturais.proxy;

public class SecurityProxy extends Proxy implements FornecedorInternet{

    private final Browser browser;
    private final String user;
    private final String senha;

    public SecurityProxy(final Browser browser, String user, String senha) {
        this.browser = browser;
        this.user = user;
        this.senha = senha;
    }

    @Override
    public String acessarSite(String url) {
        if (isNotAdmin() && isNotGoogleUrl(url)) {
            throw new IllegalArgumentException("Acesso bloquado");
        }

        return browser.acessarSite(url);
    }

    private boolean isNotAdmin() {
        return !(user.equals("admin") && senha.equals("senha"));
    }

    private boolean isNotGoogleUrl(final String url) {
        return !url.equals("www.google.com");
    }
}
