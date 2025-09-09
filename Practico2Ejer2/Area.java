package Practico2Ejer2;

import java.util.ArrayList;
import java.util.List;

public class Area {
    private Integer idArea;
    private String nombreArea;
    private Integer telefono;
    List<Documento> documento = new ArrayList<>();
    
    public Area(Integer idArea, String nombreArea, Integer telefono, List<Documento> documentos){
        this.idArea = idArea;
        this.nombreArea = nombreArea;
        this.telefono = telefono;
        this.documento = new ArrayList<>();
    }

    public List<Documento> getDocumento() {
        return documento;
    }
    public Integer getIdArea() {
        return idArea;
    }
    public String getNombreArea() {
        return nombreArea;
    }
    public Integer getTelefono() {
        return telefono;
    }

    public void setDocumento(List<Documento> documento) {
        this.documento = documento;
    }
    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }
    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
    
}
