package Practico2Ejer2;


import java.util.ArrayList;
import java.util.List;

public class Documento {
    private Integer id;
    private Integer fechaCreacion;
    private Area area;
    List<Movimiento> movimiento = new ArrayList<>();
    
    public Documento(Integer fechaCreacion, List<Movimiento> movimientos, Area area){
        this.id = id++;
        this.fechaCreacion = fechaCreacion;
        this.movimiento = new ArrayList<>();
        this.area = area;
    }


    public Area getArea() {
        return area;
    }

    public List<Movimiento> getMovimiento() {
        return movimiento;
    }

    public Integer getFechaCreacion() {
        return fechaCreacion;
    }

    public Integer getId() {
        return id;
    }


    public void setArea(Area area) {
        this.area = area;
    }
    
    public void setMovimiento(List<Movimiento> movimiento) {
        this.movimiento = movimiento;
    }

    public void setFechaCreacion(Integer fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
