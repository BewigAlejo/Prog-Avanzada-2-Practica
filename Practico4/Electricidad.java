package Practico4;

public class Electricidad extends Articulo{
    private double potenciaMaxima;

    public Electricidad(String nombre, Double precio, double potenciaMaxima) {
        super(nombre, precio);
        this.potenciaMaxima = potenciaMaxima;
    }

    public double getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(double potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }
    
}
