package Practico4;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String telefono;
    private List <Factura> facturas;

    public Cliente(String nombre, String apellido, String dni, String direccion, String telefono, List<Factura> facturas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.facturas = new ArrayList<Factura>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    
}
