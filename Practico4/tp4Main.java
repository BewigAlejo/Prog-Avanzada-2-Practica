package Practico4;

import java.util.List;
import java.util.Scanner;

public class tp4Main {
    public static void main(String[] args) {
        FacturaService svc = new FacturaService();   // ¡una sola instancia!
        Scanner in = new Scanner(System.in);
        int op;

        do {
            System.out.println("""
                    ==========================
                    1) CRUD Clientes
                    2) CRUD Articulos
                    3) Crear Factura
                    4) Listar Facturas
                    0) Salir
                    ==========================
                    """);
            System.out.print("Opcion: ");
            op = leerEntero(in);

            switch (op) {
                case 1 -> menuClientes(svc, in);
                case 2 -> menuArticulos(svc, in);
                case 3 -> flujoCrearFactura(svc, in);
                case 4 -> listarFacturas(svc);
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion invalida.");
            }
        } while (op != 0);
    }

    // ================= CLIENTES =================
    private static void menuClientes(FacturaService svc, Scanner in) {
        int o;
        do {
            System.out.println("""
                    --- CLIENTES ---
                    1) Crear
                    2) Modificar
                    3) Eliminar
                    4) Listar
                    0) Volver
                    """);
            System.out.print("Opcion: ");
            o = leerEntero(in);
            switch (o) {
                case 1 -> Cliente.createCliente(svc.getClientes());
                case 2 -> Cliente.updateCliente(svc.getClientes());
                case 3 -> Cliente.deleteCliente(svc.getClientes());
                case 4 -> listarClientes(svc.getClientes());
                case 0 -> {}
                default -> System.out.println("Opcion invalida.");
            }
        } while (o != 0);
    }

    private static void listarClientes(List<Cliente> clientes) {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes cargados.");
            return;
        }
        System.out.println("DNI\t\tNombre y Apellido\tDireccion\tTelefono");
        for (Cliente c : clientes) {
            System.out.printf("%s\t%s %s\t%s\t%s%n",
                    c.getDni(), c.getNombre(), c.getApellido(), c.getDireccion(), c.getTelefono());
        }
    }

    // ================= ARTICULOS =================
    private static void menuArticulos(FacturaService svc, Scanner in) {
        int o;
        do {
            System.out.println("""
                    --- ARTICULOS ---
                    1) Crear
                    2) Modificar
                    3) Eliminar
                    4) Listar
                    0) Volver
                    """);
            System.out.print("Opcion: ");
            o = leerEntero(in);
            switch (o) {
                case 1 -> Articulo.createArticulo(svc.getCatalogo());
                case 2 -> Articulo.updateArticulo(svc.getCatalogo());
                case 3 -> Articulo.deleteArticulo(svc.getCatalogo());
                case 4 -> listarCatalogo(svc.getCatalogo());
                case 0 -> {}
                default -> System.out.println("Opcion invalida.");
            }
        } while (o != 0);
    }

    private static void listarCatalogo(List<Articulo> catalogo) {
        if (catalogo.isEmpty()) {
            System.out.println("No hay articulos cargados.");
            return;
        }
        int idx = 0;
        System.out.println("#\tNombre\t\tTipo\t\tPrecio");
        for (Articulo a : catalogo) {
            System.out.printf("%d)\t%s\t\t%s\t\t%.2f%n",
                    idx++, a.getNombre(), tipoArticulo(a), a.getPrecio());
        }
    }

    private static String tipoArticulo(Articulo a) {
        if (a instanceof Industrial)   return "Elect./Industrial";
        if (a instanceof Electricidad) return "Elect./Domiciliaria";
        if (a instanceof Herramientas) return "Herramientas";
        return "Articulo";
    }

    // ================= FACTURAS =================
    private static void flujoCrearFactura(FacturaService svc, Scanner in) {
        if (svc.getClientes().isEmpty()) {
            System.out.println("No hay clientes. Cargalos en el menu Clientes.");
            return;
        }
        if (svc.getCatalogo().isEmpty()) {
            System.out.println("No hay articulos. Cargalos en el menu Articulos.");
            return;
        }

        listarClientes(svc.getClientes());
        System.out.print("DNI del cliente: ");
        String dni = in.nextLine().trim();

        System.out.print("Letra (A/B/C): ");
        char letra = in.nextLine().trim().toUpperCase().charAt(0);

        Factura f;
        try {
            f = svc.crearFactura(letra, dni);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        // Agregar items (elegir por indice para evitar errores de nombre)
        String seguir = " ";
        do {
            listarCatalogo(svc.getCatalogo());
            System.out.print("Elegir # de articulo: ");
            int idx = leerEntero(in);
            if (idx < 0 || idx >= svc.getCatalogo().size()) {
                System.out.println("Indice invalido.");
                continue;
            }
            Articulo elegido = svc.getCatalogo().get(idx);

            System.out.print("Cantidad: ");
            int cant = leerEntero(in);
            try {
                svc.agregarItemAFactura(f, elegido.getNombre(), cant);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("¿Agregar otro item? (s/n): ");
            seguir = in.nextLine().trim().toLowerCase();
        } while (seguir.equals("s"));

        // Mostrar detalle
        System.out.println(svc.renderTablaFactura(f));
    }

    private static void listarFacturas(FacturaService svc) {
        var list = svc.listarFacturasOrdenadasPorFecha();
        if (list.isEmpty()) {
            System.out.println("No hay facturas cargadas.");
            return;
        }
        System.out.println("Fecha\t\tNro\tLetra\tCliente");
        for (Factura fac : list) {
            Cliente c = fac.getCliente();
            System.out.printf("%s\t%d\t%s\t%s %s%n",
                    fac.getFecha(), fac.getNroFactura(), fac.getLetra(),
                    c != null ? c.getNombre() : "-", c != null ? c.getApellido() : "-");
        }
    }

    // ================= Helpers =================
    private static int leerEntero(Scanner in) {
        while (true) {
            try {
                String s = in.nextLine().trim();
                return Integer.parseInt(s);
            } catch (Exception e) {
                System.out.print("Ingrese un numero valido: ");
            }
        }
    }
}
