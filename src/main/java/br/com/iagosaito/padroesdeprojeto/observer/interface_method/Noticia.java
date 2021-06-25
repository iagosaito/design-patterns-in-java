package br.com.iagosaito.padroesdeprojeto.observer.interface_method;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Noticia {

    private String titulo;
    private TipoNoticia tipoNoticia;
    private String corpoNoticia;

    enum TipoNoticia {
        POLITICA, ESPORTE
    }
}
