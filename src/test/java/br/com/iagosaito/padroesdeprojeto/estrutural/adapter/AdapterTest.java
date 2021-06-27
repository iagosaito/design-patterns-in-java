package br.com.iagosaito.padroesdeprojeto.estrutural.adapter;

import br.com.iagosaito.padroesdeprojeto.estruturais.adapter.Caicara;
import br.com.iagosaito.padroesdeprojeto.estruturais.adapter.PatineteMotorizadoAdapter;
import br.com.iagosaito.padroesdeprojeto.estruturais.adapter.Turista;
import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    void deveTuristaAndarDePatinete() {
        final Turista turistaModerno = new Turista(new PatineteMotorizadoAdapter());
        turistaModerno.pedalar();

        final Turista turistaRaiz = new Turista(new Caicara());
        turistaRaiz.pedalar();
    }
}