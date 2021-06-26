package br.com.iagosaito.padroesdeprojeto.comportamental.observer.interface_method;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Noticia {

    private String titulo;
    private TipoNoticia tipoNoticia;
    private String corpoNoticia;

    public enum TipoNoticia {
        POLITICA, ESPORTE
    }
}
