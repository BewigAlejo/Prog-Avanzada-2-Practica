package Practico4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tp4Main {

    public static void generarCliente(List<Cliente> clientes) {
        int var;
        do {
           Scanner scanner = new Scanner(System.in);
              System.out.println("Seleccione una opcion: \n1. Crear Cliente \n2. Leer Cliente \n3. Actualizar Cliente \n4. Borrar Cliente \n5. Salir");
                var = scanner.nextInt();
                switch (var) {
                    case 1:
                        Cliente.createCliente(clientes);
                        break;
                    case 2:
                        Cliente.readCliente(clientes);
                        break;
                    case 3:
                        Cliente.updateCliente(clientes);
                        break;
                    case 4:
                        Cliente.deleteCliente(clientes);
                        break;
                    default:
                        break;
                } 
        } while (var != 5);
    }

    public static void generarArticulo(List<Articulo> articulos) {
        int var;
        do {
           Scanner scanner = new Scanner(System.in);
              System.out.println("Seleccione una opcion: \n1. Crear Articulo \n2. Leer Articulo \n3. Actualizar Articulo \n4. Borrar Articulo \n5. Salir");
                var = scanner.nextInt();
                switch (var) {
                    case 1:
                        Articulo.createArticulo(articulos);
                        break;
                    case 2:
                        Articulo.readArticulo(articulos);
                        break;
                    case 3:
                        Articulo.updateArticulo(articulos);
                        break;
                    case 4:
                        Articulo.deleteArticulo(articulos);
                        break;
                    default:
                        break;
                } 
        } while (var != 5);
    }

    public static void main(String[] args) {
        //Switch de crud
        int var;
        List<Cliente> clientes = new ArrayList<Cliente>();
        List<Articulo> articulos = new ArrayList<Articulo>();
        do {
            System.out.println("Seleccione una opcion: \n1. CRUD Cliente \n2. CRUD Articulos \n3. Salir");
            Scanner scanner = new Scanner(System.in);
            var = scanner.nextInt();
                switch (var) {
                    case 1:
                        System.out.println("CRUD Cliente");
                        generarCliente(clientes);
                        break;
                    case 2:
                        System.out.println("CRUD Articulos");
                        generarArticulo(articulos);
                        break;
                    default:
                        break;
                }
        } while (var != 3);
        
    }
}





