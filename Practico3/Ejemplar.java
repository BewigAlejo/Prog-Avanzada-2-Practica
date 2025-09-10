package Practico3;

public class Ejemplar {
    private Boolean prestado;
    private Boolean sale;
    private Integer nroInventario;
    private Libro libro;

    public Ejemplar(Boolean prestado, Boolean sale, Integer nroInventario, Libro libro) {
        this.prestado = prestado;
        this.sale = sale;
        this.nroInventario = nroInventario;
        this.libro = libro;
    }

    public Boolean getPrestado() {
        return prestado;
    }

    public Libro getLibro() {
        return libro;
    }

    public Integer getNroInventario() {
        return nroInventario;
    }

    public Boolean getSale() {
        return sale;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setNroInventario(Integer nroInventario) {
        this.nroInventario = nroInventario;
    }

    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }

    public void setSale(Boolean sale) {
        this.sale = sale;
    }
}
