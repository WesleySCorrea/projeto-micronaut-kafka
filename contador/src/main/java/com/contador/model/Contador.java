package com.contador.model;

import io.micronaut.core.annotation.Creator;
import io.micronaut.core.annotation.Introspected;

@Introspected
public class Contador {

    private String codigoLivro;
    private Long contagem;

    @Creator
    public Contador() {
    }

    public Contador(String codigoLivro, Long contagem) {
        this.codigoLivro = codigoLivro;
        this.contagem = contagem;
    }

    public String getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(String codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public Long getContagem() {
        return contagem;
    }

    public void setContagem(Long contagem) {
        this.contagem = contagem;
    }
}
