package Practico4;

public class Item {
    private Integer cantidad;
    private Factura factura;
    private Articulo articulo;

    public Item(Integer cantidad, Factura factura, Articulo articulo) {
        this.cantidad = cantidad;
        this.factura = factura;
        this.articulo = articulo;
    }

    

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }


}
