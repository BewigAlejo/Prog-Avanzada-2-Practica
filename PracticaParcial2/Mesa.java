package PracticaParcial2;

public class Mesa {
    private static Integer contador = 1; // Variable estática para llevar el conteo de IDs
    private Integer id;
    private Integer cantidadMax;
    private Integer estado; // 0 = libre, 1 = ocupada

    public Mesa(Integer cantidadMax, Integer estado) {
        this.cantidadMax = cantidadMax;
        this.estado = estado;
        // Para que el ID sea autoincremental, usa una variable estática para llevar el conteo
        this.id = contador++;
    }

    public Integer getCantidadMax() {
        return cantidadMax;
    }

    public void setCantidadMax(Integer cantidadMax) {
        this.cantidadMax = cantidadMax;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

}
