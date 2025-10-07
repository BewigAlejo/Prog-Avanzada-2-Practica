package Practico4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
    private static long CONTADOR = 0;          // autonumeración consecutiva

    private Date fecha;
    private Long nroFactura;
    private Character letra;
    private List<Item> item = new ArrayList<>();
    private Cliente cliente;

    // Constructor para el flujo del punto c
    public Factura(Character letra, Cliente cliente) {
        this.fecha = new Date();               // c.3 fecha actual
        this.nroFactura = ++CONTADOR;          // c.5 consecutivo 1,2,3...
        this.letra = letra;                    // c.4 A/B/C
        this.cliente = cliente;
    }

    // ---- helpers compatibles con tu Item ----
    public void agregarItem(Articulo a, int cantidad){
        this.item.add(new Item(cantidad, this, a));
    }

    public Double informarTotalPagar(){
        double total = 0.0;
        for (Item i : item) total += i.getCantidad() * i.getArticulo().getPrecio();
        return total;
    }

    // ---- getters que usa el servicio ----
    public Date getFecha()        { return fecha; }
    public Long getNroFactura()   { return nroFactura; }
    public Character getLetra()   { return letra; }
    public List<Item> getItem()   { return item; }
    public Cliente getCliente()   { return cliente; }
}
