package Practico2;

public class ClaseMateria {
    private Integer idMat;
    private String nomMat;
    private Integer anioCursado;
    private ClasePlan plan;   // cada materia pertenece a un plan

    public ClaseMateria(Integer idMat, String nomMat, Integer anioCursado, ClasePlan plan) {
        this.idMat = idMat;
        this.nomMat = nomMat;
        this.anioCursado = anioCursado;
        this.plan = plan;
    }

    public Integer getAnioCursado() {
        return anioCursado;
    }
    public Integer getIdMat() {
        return idMat;
    }
    public String getNomMat() {
        return nomMat;
    }
    public ClasePlan getPlan() {
        return plan;
    }

    public void setAnioCursado(Integer anioCursado) {
        this.anioCursado = anioCursado;
    }
    public void setIdMat(Integer idMat) {
        this.idMat = idMat;
    }
    public void setNomMat(String nomMat) {
        this.nomMat = nomMat;
    }
    public void setPlan(ClasePlan plan) {
        this.plan = plan;
    }

}
