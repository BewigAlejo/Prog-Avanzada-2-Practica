package Practico4;

public class Herramientas extends Articulo{
    private String descripcion;

    public Herramientas(String nombre, Double precio, String descripcion) {
        super(nombre, precio);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
