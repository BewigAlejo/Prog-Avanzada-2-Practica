package Practico4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    //Metodos CRUD cliente

    public static void createCliente(List<Cliente> clientes){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del cliente: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese el DNI del cliente: ");
        String dni = scanner.nextLine();
        System.out.println("Ingrese la direccion del cliente: ");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese el telefono del cliente: ");
        String telefono = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, apellido, dni, direccion, telefono, null);
        clientes.add(cliente);
        System.out.println("Cliente creado exitosamente.");
    }

    public static void readCliente(List<Cliente> clientes){
        for(Cliente cliente : clientes){
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Apellido: " + cliente.getApellido());
            System.out.println("DNI: " + cliente.getDni());
            System.out.println("Direccion: " + cliente.getDireccion());
            System.out.println("Telefono: " + cliente.getTelefono());
            System.out.println("Facturas: " + cliente.getFacturas());
            System.out.println("------------------------------");

        }
    }

    public static void updateCliente(List<Cliente> clientes){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el DNI del cliente a actualizar: ");
        String dniComp = scanner.nextLine();
        for(Cliente cliente : clientes){
            if (cliente.getDni() == dniComp) {
                System.out.println("Ingrese el nuevo nombre del cliente: ");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese el nuevo apellido del cliente: ");
                String apellido = scanner.nextLine();
                System.out.println("Ingrese el nuevo DNI del cliente: ");
                String dni = scanner.nextLine();
                System.out.println("Ingrese la nueva direccion del cliente: ");
                String direccion = scanner.nextLine();
                System.out.println("Ingrese el nuevo telefono del cliente: ");
                String telefono = scanner.nextLine();

                cliente.setNombre(nombre);
                cliente.setApellido(apellido);
                cliente.setDni(dni);
                cliente.setDireccion(direccion);
                cliente.setTelefono(telefono);

                System.out.println("Cliente actualizado exitosamente.");
                
            }else{
                System.out.println("Cliente no encontrado.");
            }
        }
    }


    public static void deleteCliente(List<Cliente> clientes){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el DNI del cliente a eliminar: ");
        String dniComp = scanner.nextLine();
        for(Cliente cliente : clientes){
            if (cliente.getDni() == dniComp) {
                clientes.remove(cliente);
                System.out.println("Cliente eliminado exitosamente.");
                break;
            }else{
                System.out.println("Cliente no encontrado.");
            }
        }
    }

}
