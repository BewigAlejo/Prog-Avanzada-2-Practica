package PracticaParcial2;


import java.util.ArrayList;
import java.util.Scanner;

public class RestoMain {

    public static void mostrarMenu() {
        System.out.println("1. Registrar cliente");
        System.out.println("2. Registrar mesa");
        System.out.println("3. Registrar reserva");
        System.out.println("4. Listar reservas");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    public static void registrarCliente(ArrayList<Cliente> clientes, Scanner scanner) {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.next(); scanner.nextLine(); 
        System.out.print("Ingrese el telefono del cliente: ");
        String telefono = scanner.next(); scanner.nextLine();
        System.out.print("Ingrese el DNI del cliente: ");
        String dni = scanner.next(); scanner.nextLine();

        Cliente nuevoCliente = new Cliente(nombre, telefono, dni);
        clientes.add(nuevoCliente);
        System.out.println("Cliente registrado exitosamente.");
    }

    public static void registrarMesa(ArrayList<Mesa> mesas, Scanner scanner) {
        System.out.print("Ingrese la cantidad maxima de personas para la mesa: ");
        Integer cantidadMax = scanner.nextInt(); scanner.nextLine(); 
        Integer estado = 0; // Mesa libre al momento de crearla

        Mesa nuevaMesa = new Mesa(cantidadMax, estado);
        mesas.add(nuevaMesa);
        System.out.println("Mesa registrada exitosamente.");
    }

    public static void listarReservas(ArrayList<Reserva> reservas){
        for (Reserva reserva : reservas) {
            System.out.println("Cliente: " + reserva.getCliente().getNombre() +
                               ", Mesa ID: " + reserva.getMesa().getId() +
                               ", Cantidad Personas: " + reserva.getCantidadPersonas() +
                               ", Fecha: " + reserva.getFecha() +
                               ", Hora: " + reserva.getHora() +
                               ", Estado: " + (reserva.getEstado()));
        }
    }

    public static void main(String[] args) {
        Integer opcion = 0;
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Mesa> mesas = new ArrayList<>();
        ArrayList<Reserva> reservas = new ArrayList<>();
        

        do {
            mostrarMenu();
            // Leer opcion del usuario
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt(); scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    // Registrar cliente
                    registrarCliente(clientes, scanner);
                    break;
                case 2:
                    // Registrar mesa
                    registrarMesa(mesas, scanner);
                    break;
                case 3:
                    // Registrar reserva
                    Reserva.registrarReserva(reservas, clientes, mesas, scanner);
                    break;
                case 4:
                    // Listar reservas
                    listarReservas(reservas);
                    break;
                case 5:
                    // Salir
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    break;
            }
        } while (opcion != 5);
    }
}
