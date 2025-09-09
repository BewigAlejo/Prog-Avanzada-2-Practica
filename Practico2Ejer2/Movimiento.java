package Practico2Ejer2;



public class Movimiento {
    private Integer idMovimiento;
    private Integer fechaMovimiento;
    private Documento documento;

    public Movimiento( Integer idMovimiento, Integer fechaMovimiento, Documento documento){
        this.idMovimiento = idMovimiento;
        this.fechaMovimiento = fechaMovimiento;
        this.documento = documento;
    }

    public Integer getFechaMovimiento() {
        return fechaMovimiento;
    }
    public Documento getDocumento() {
        return documento;
    }
    public Integer getIdMovimiento() {
        return idMovimiento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
    public void setFechaMovimiento(Integer fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }
    public void setIdMovimiento(Integer idMovimiento) {
        this.idMovimiento = idMovimiento;
    }
}
