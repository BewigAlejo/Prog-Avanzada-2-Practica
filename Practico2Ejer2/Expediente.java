package Practico2Ejer2;

import java.util.List;

public class Expediente extends Documento{
    private Integer nroExpediente;
    private String letra;
    private Integer anioExpediente;
    private String anexo;

    public Expediente(Integer id, Integer fechaCreacion, Integer nroExpediente, String letra, Integer anioExpediente, String anexo, Area area, List<Movimiento> movimientos) {
        super(fechaCreacion, movimientos , area);
        this.nroExpediente = nroExpediente;
        this.letra = letra;
        this.anioExpediente = anioExpediente;
        this.anexo = anexo;
    }
    
    public Integer getNroExpediente() {
        return nroExpediente;
    }
    public String getLetra() {
        return letra;
    }
    public Integer getAnioExpediente() {
        return anioExpediente;
    }
    public String getAnexo() {
        return anexo;
    }

    public void setNroExpediente(Integer nroExpediente) {
        this.nroExpediente = nroExpediente;
    }
    public void setLetra(String letra) {
        this.letra = letra;
    }
    public void setAnioExpediente(Integer anioExpediente) {
        this.anioExpediente = anioExpediente;
    }
    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

}