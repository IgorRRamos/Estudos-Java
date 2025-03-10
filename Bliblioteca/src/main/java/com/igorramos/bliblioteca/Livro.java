package com.igorramos.bliblioteca;

public class Livro {
    private String autor, titulo;
    private boolean locado;
    private int id;

    public Livro(int id, String autor, String titulo) {
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.locado = false;      
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isLocado() {
        return locado;
    }

    public void setLocado(boolean locado) {
        this.locado = locado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
 
}
