package PracticaParcial1;

import java.util.ArrayList;

public class Alquiler {
    private Cliente cliente;
    private Auto auto;
    private Integer dias;
    private Boolean activo;
    
    public Alquiler(Cliente cliente, Auto auto, Integer dias) {
        this.cliente = cliente;
        this.auto = auto;
        this.dias = dias;
        this.activo = true;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
   //Alquilar auto
   public static void alquilarAuto(Auto auto, ArrayList<Alquiler> alquileres, Cliente cliente, Integer dias){
        Alquiler alquiler = new Alquiler(cliente, auto, dias);
        alquileres.add(alquiler);
        System.out.println("Auto alquilado a " + cliente.getNombre() + " por " + dias + " días.");
   }
}
