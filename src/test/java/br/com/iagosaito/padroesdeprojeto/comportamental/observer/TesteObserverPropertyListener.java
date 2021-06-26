package br.com.iagosaito.padroesdeprojeto.comportamental.observer;

import br.com.iagosaito.padroesdeprojeto.comportamental.observer.property_changed_listener.ClienteA;
import br.com.iagosaito.padroesdeprojeto.comportamental.observer.property_changed_listener.ClienteB;
import br.com.iagosaito.padroesdeprojeto.comportamental.observer.property_changed_listener.MercadoLivre;
import org.junit.jupiter.api.Test;

public class TesteObserverPropertyListener {

    @Test
    void deveNotificarSobrePromocao() {

        final ClienteA clienteA = new ClienteA();
        final ClienteB clienteB = new ClienteB();

        final MercadoLivre mercadoLivre = new MercadoLivre();
        mercadoLivre.addListener(clienteA);
        mercadoLivre.addListener(clienteB);

        mercadoLivre.postPromocao("Galaxy Y por 399,99 reais!!");
    }
}
