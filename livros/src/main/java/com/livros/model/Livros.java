package com.livros.model;

import io.micronaut.core.annotation.Introspected;

import java.util.Objects;

@Introspected
public class Livros {

    private String codigo;
    private String name;
    private String autor;

    public Livros(){
    }

    public Livros(String codigo, String name, String autor) {
        this.codigo = codigo;
        this.name = name;
        this.autor = autor;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livros)) return false;
        Livros livros = (Livros) o;
        return codigo.equals(livros.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Livros{" +
                "codigo='" + codigo + '\'' +
                ", name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
