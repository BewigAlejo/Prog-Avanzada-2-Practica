package Practico2Ejer2;

import java.util.List;

public class Nota extends Documento{
    private Integer nroNota;
    private Integer anioNota;
    private String asunto;

    public Nota(Integer id, Integer fechaCreacion, Integer nroNota, Integer anioNota, String asunto, Area area, List<Movimiento> movimientos) {
        super(id, fechaCreacion, movimientos , area);
        this.nroNota = nroNota;
        this.anioNota = anioNota;
        this.asunto = asunto;
    }

    public Integer getNroNota() {
        return nroNota;
    }

    public Integer getAnioNota() {
        return anioNota;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setNroNota(Integer nroNota) {
        this.nroNota = nroNota;
    }

    public void setAnioNota(Integer anioNota) {
        this.anioNota = anioNota;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

}