package Practico4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
    private Date fecha;
    private Long nroFactura;
    private Character letra;
    private List < Item > item;
    private Cliente cliente;

    public Factura(Date fecha, Character letra, List<Item> item, Cliente cliente) {
        this.fecha = fecha;
        this.nroFactura = nroFactura++;
        this.letra = letra;
        this.item = new ArrayList<Item>();
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getNroFactura() {
        return nroFactura;
    }

    public Character getLetra() {
        return letra;
    }

    public void setLetra(Character letra) {
        this.letra = letra;
    }

    public List<Item> getItems() {
        return item;
    }

    public void setItems(List<Item> items) {
        this.item = items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double informarTotalPagar(){
        Double total = 0.0;
        for (Item i : item) {
            total += i.getCantidad() * i.getArticulo().getPrecio();
        }
        return total;
    }
}
