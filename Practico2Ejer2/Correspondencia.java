package Practico2Ejer2;

import java.util.List;

public class Correspondencia extends Documento{
    private String remitente;
    private String direccion;

    public Correspondencia(Integer id, Integer fechaCreacion, String remitente, String direccion, Area area, List<Movimiento> movimientos) {
        super(id, fechaCreacion, movimientos , area);
        this.remitente = remitente;
        this.direccion = direccion;
    }

    public String getRemitente() {
        return remitente;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}