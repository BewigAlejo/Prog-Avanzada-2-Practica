package Practico2;

import java.util.ArrayList;
import java.util.List;

public class ClaseCarrera {
    private Integer idCarrera;
    private String nomCarrera;
    private List<ClasePlan> planes;

    public ClaseCarrera(Integer idCarrera, String nomCarrera) {
        this.idCarrera = idCarrera;
        this.nomCarrera = nomCarrera;
        this.planes = new ArrayList<>();
    }

    
    public Integer getIdCarrera() {
        return idCarrera;
    }

   public List<ClasePlan> getPlanes() {
       return planes;
   }

    public String getNomCarrera() {
        return nomCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

   public void setPlanes(List<ClasePlan> planes) {
       this.planes = planes;
   }

    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }
}
