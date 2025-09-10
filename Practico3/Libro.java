package Practico3;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private Autor autor;
    private Integer edicion;
    private List <Autor> autores;
    private Biblioteca biblioteca;
    private List<Ejemplar> ejemplares;

    public Libro(String titulo, Autor autor,Integer edicion, Biblioteca biblioteca, List<Autor> autores, List<Ejemplar> ejemplares) {
        this.titulo = titulo;
        this.biblioteca = biblioteca;
        this.autor = autor;
        this.edicion = edicion;
        this.autores = new ArrayList<Autor>();
        this.ejemplares = new ArrayList<Ejemplar>();
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Integer getEdicion() {
        return edicion;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    
    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void setEdicion(Integer edicion) {
        this.edicion = edicion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
