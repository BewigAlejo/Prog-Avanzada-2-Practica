package Practico4;

public class Industrial extends Electricidad{
    private Double temperaturaMinima;
    private Double temperaturaMaxima;

    public Industrial(String nombre, Double precio, double potenciaMaxima, Double temperaturaMinima, Double temperaturaMaxima) {
        super(nombre, precio, potenciaMaxima);
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public Double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(Double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }
    
    public Double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(Double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }
}
