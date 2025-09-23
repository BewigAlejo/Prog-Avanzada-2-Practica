package PracticaParcial1;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private String nombre;
    private String dni;
    private String telefono;
    
    public Cliente(String nombre, String dni, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static void registrarCliente(ArrayList<Cliente> clientes) {
        System.out.println("Ingrese su nombre:");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su DNI:");
        String dni = scanner.nextLine();
        System.out.println("Ingrese su teléfono:");
        String telefono = scanner.nextLine();
        Cliente cliente = new Cliente(nombre, dni, telefono);
        System.out.println("Cliente registrado: " + cliente.getNombre() + ", DNI: " + cliente.getDni() + ", Teléfono: " + cliente.getTelefono());
        clientes.add(cliente);
    }
}
