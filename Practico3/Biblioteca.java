package Practico3;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private Integer telefono;
    private List <Libro> libros;
    
    public Biblioteca(String nombre, String direccion, Integer telefono, List<Libro> libros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.libros = new ArrayList<Libro>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    
}
