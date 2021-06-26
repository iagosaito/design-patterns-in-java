package br.com.iagosaito.padroesdeprojeto.comportamental.observer.property_changed_listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ClienteB implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        final String promocao = (String) evt.getNewValue();
        System.out.println("Hmm!! Ainda está caro, vou aguardar!!sssss");
    }
}
