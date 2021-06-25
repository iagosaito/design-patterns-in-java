package br.com.iagosaito.padroesdeprojeto.observer.property_changed_listener;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class MercadoLivre {

    private String promocao;
    private PropertyChangeSupport propertyChangeSupport;

    public MercadoLivre() {
        propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addListener(PropertyChangeListener propertyChangeListener) {
        propertyChangeSupport.addPropertyChangeListener(propertyChangeListener);
    }

    public void removeListener(PropertyChangeListener propertyChangeListener) {
        propertyChangeSupport.removePropertyChangeListener(propertyChangeListener);
    }

    public void postPromocao(final String novaPromocao) {
        propertyChangeSupport.firePropertyChange("Promoção!", this.promocao, novaPromocao);
    }
}
