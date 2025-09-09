package Practico2;

import java.util.ArrayList;
import java.util.List;

public class ClasePlan {
    private Integer idPlan;
    private String nomPlan;
    private Integer anioInicio;
    private List<ClaseMateria> materias;   // relación 1 a N con Materia


    public ClasePlan(Integer idPlan, String nomPlan, Integer anioInicio, List<ClaseMateria> materias) {
        this.idPlan = idPlan;
        this.nomPlan = nomPlan;
        this.anioInicio = anioInicio;
        this.materias = new ArrayList<>();;
    }

    public Integer getAnioInicio() {
        return anioInicio;
    }
    public Integer getIdPlan() {
        return idPlan;
    }
    public List<ClaseMateria> getMaterias() {
        return materias;
    }
    public String getNomPlan() {
        return nomPlan;
    }

    public void setAnioInicio(Integer anioInicio) {
        this.anioInicio = anioInicio;
    }
    public void setIdPlan(Integer idPlan) {
        this.idPlan = idPlan;
    }
    public void setMaterias(List<ClaseMateria> materias) {
        this.materias = materias;
    }
    public void setNomPlan(String nomPlan) {
        this.nomPlan = nomPlan;
    }

}
