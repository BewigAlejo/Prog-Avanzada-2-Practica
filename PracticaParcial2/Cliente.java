package PracticaParcial2;

public class Cliente {
    private String nombre;
    private String telefono;
    private String dni;


    public Cliente(String nombre, String telefono, String dni) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    
}
