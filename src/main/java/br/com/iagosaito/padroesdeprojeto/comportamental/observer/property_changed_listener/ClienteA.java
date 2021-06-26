package br.com.iagosaito.padroesdeprojeto.comportamental.observer.property_changed_listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ClienteA implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        final String promocao = (String) evt.getNewValue();
        System.out.println("Hmmm!! Boa promoção, vou comprar!!");
    }
}
