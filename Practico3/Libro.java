package Practico3;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private Integer edicion;
    private List <Autor> autores;
    private Biblioteca biblioteca;
    private List<Ejemplar> ejemplares;

    public Libro(String titulo, Integer edicion, Biblioteca biblioteca, List<Autor> autores, List<Ejemplar> ejemplares) {
        this.titulo = titulo;
        this.biblioteca = biblioteca;
        this.edicion = edicion;
        //Hay que mandar un try catch para el punto 3 -> edicion < 1900 || edicion > 2018
        this.autores = new ArrayList<Autor>();
        this.ejemplares = new ArrayList<Ejemplar>();
    }

    public String getTitulo() {
        return titulo;
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
