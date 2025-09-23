package PracticaParcial1;


import java.util.ArrayList;
import java.util.Scanner;

public class sistemaMain {
    public static void main(String[] args) {
        System.out.println("Sistema de Alquiler de Autos");
        ArrayList<Auto> autos = new ArrayList<Auto>();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();
        
        Integer opcion;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Seleccione una opcion: 1. Registrar cliente 2. Registrar auto 3. Listar autos disponibles 4. Devolver auto 5. Salir");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        Cliente.registrarCliente(clientes);
                        break;
                    case 2:
                        Auto.registrarAuto(autos);
                        break;
                    case 3:
                        Boolean encontrado = false;
                        System.out.println("Ingrese su DNI para continuar:");
                        String dni = scanner.next();
                        for (Cliente cliente : clientes) {
                            if (cliente.getDni().equals(dni)) {
                                System.out.println("Bienvenido " + cliente.getNombre());
                                Auto.listarAutos(autos, cliente, alquileres);
                                encontrado = true;
                                break;
                            }
                        }
                        if (encontrado == false) {
                            System.out.println("DNI no encontrado. Registrese primero.");
                        }
                        break;
                    case 4:
                        Auto.devolverAuto(autos, alquileres);
                        break;
                    case 5:
                        System.out.println("Saliendo del sistema. ¡nv gay!");
                        break;
                    default:
                        break;
                }
            } while (opcion!=5); 

        
    }
}
