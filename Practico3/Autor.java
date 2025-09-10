package Practico3;

import java.util.List;

public class Autor {
    private String autor;
    private List <Libro> libros;
    
    public Autor(String autor, List<Libro> libros) {
        this.autor = autor;
        this.libros = libros;
    }
    
    public String getAutor() {
        return autor;
    }
    public List<Libro> getLibros() {
        return libros;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
}
