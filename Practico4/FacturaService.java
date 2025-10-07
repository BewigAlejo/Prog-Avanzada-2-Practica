package Practico4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FacturaService {

    // Un solo “source of truth”:
    private final List<Cliente>  clientes = new ArrayList<>();
    private final List<Articulo> catalogo = new ArrayList<>();
    private final List<Factura>  facturas = new ArrayList<>();

    // Exponer las listas para que tus CRUD estáticos trabajen sobre estas
    public List<Cliente>  getClientes() { return clientes; }
    public List<Articulo> getCatalogo() { return catalogo; }
    public List<Factura>  getFacturas() { return facturas; }

    // Cargar datos (si querés también desde tus CRUD)
    public void agregarCliente(Cliente c){ if (c!=null) clientes.add(c); }
    public void registrarArticulo(Articulo a){ if (a!=null) catalogo.add(a); }

    // ---------- c.1 Seleccionar cliente ----------
    private Cliente seleccionarClientePorDni(String dni){
        if (dni == null) return null;
        for (Cliente cli : clientes){
            if (dni.equals(cli.getDni())) return cli;   // equals, no "=="
        }
        return null;
    }

    // ---------- c.1–c.5 Crear factura ----------
    public Factura crearFactura(char letra, String dniCliente){
        char L = Character.toUpperCase(letra);
        if (L!='A' && L!='B' && L!='C') throw new IllegalArgumentException("Letra inválida (A/B/C)");
        Cliente cli = seleccionarClientePorDni(dniCliente);
        if (cli == null) throw new IllegalArgumentException("Cliente no encontrado");
        Factura f = new Factura(L, cli);     // fecha y nro automático dentro de Factura
        facturas.add(f);
        return f;
    }

    // ---------- c.2 Agregar ítems desde un ÚNICO catálogo ----------
    public void agregarItemAFactura(Factura f, String nombreArticulo, int cantidad){
        if (f == null) throw new IllegalArgumentException("Factura requerida");
        if (cantidad <= 0) throw new IllegalArgumentException("Cantidad > 0");
        Articulo art = buscarArticuloPorNombre(nombreArticulo);
        if (art == null) throw new IllegalArgumentException("Artículo no encontrado en catálogo");
        f.agregarItem(art, cantidad);
    }

    private Articulo buscarArticuloPorNombre(String nombre){
        if (nombre == null) return null;
        String needle = nombre.trim().toLowerCase();
        for (Articulo a : catalogo){
            String n = a.getNombre();
            if (n != null && n.trim().toLowerCase().equals(needle)) return a;
        }
        return null;
    }

    // ---------- c.6 Listar/ordenar/seleccionar/mostrar ----------
    public List<Factura> listarFacturasOrdenadasPorFecha(){
        return facturas.stream().sorted(Comparator.comparing(Factura::getFecha)).toList();
    }

    public Factura buscarFacturaPorNumero(long nro){
        for (Factura f : facturas){
            if (f.getNroFactura() != null && f.getNroFactura() == nro) return f;
        }
        return null;
    }

    public String renderTablaFactura(Factura f){
        if (f == null) return "Factura inexistente.";
        StringBuilder sb = new StringBuilder();
        sb.append("FACTURA ").append(f.getLetra()).append("-").append(f.getNroFactura())
          .append(" | Fecha: ").append(f.getFecha()).append("\n");

        Cliente c = f.getCliente();
        if (c != null) {
            sb.append("Cliente: ").append(c.getNombre()).append(" ").append(c.getApellido())
              .append(" | DNI: ").append(c.getDni()).append("\n");
        }

        sb.append("\nItems:\n");
        sb.append(String.format("%-25s %-18s %-10s %-10s %-10s\n",
                "Artículo", "Tipo", "Precio", "Cantidad", "Subtotal"));
        sb.append("--------------------------------------------------------------------------\n");

        double total = 0.0;
        if (f.getItem() != null) {
            for (Item it : f.getItem()){
                Articulo a = it.getArticulo();
                String nombre = (a != null ? a.getNombre() : "(sin nombre)");
                String tipo   = tipoArticulo(a);
                double precio = (a != null ? a.getPrecio() : 0.0);
                int cant      = (it.getCantidad() != null ? it.getCantidad() : 0);
                double sub    = precio * cant;
                total += sub;
                sb.append(String.format("%-25s %-18s %-10.2f %-10d %-10.2f\n",
                        nombre, tipo, precio, cant, sub));
            }
        }

        sb.append("--------------------------------------------------------------------------\n");
        sb.append(String.format("TOTAL: %.2f\n", total));
        return sb.toString();
    }

    private String tipoArticulo(Articulo a){
        if (a == null) return "-";
        if (a instanceof Industrial)   return "Electricidad/Industrial";
        if (a instanceof Electricidad) return "Electricidad/Domiciliaria";
        if (a instanceof Herramientas) return "Herramientas";
        return "Artículo";
    }

}
