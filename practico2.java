public class practico2 {
    public class materia{
        // Se definen los atributos de la clase
        private Integer idMat;
        private String nomMat;
        private Integer anioCursado;

        // Se crea un builder
        public materia(Integer idMat, String nomMat, Integer anioCursado){
                this.anioCursado = anioCursado;
                this.idMat = anioCursado;
                this.nomMat = nomMat;
        }

        // Se crean los metodos getters (encapsulamiento)
        public Integer getidMat(){ return idMat;}
        public Integer getanioCursado(){ return anioCursado; }
        public String getnomMat(){ return nomMat;}

    }

    public class plan{
        private Integer idPlan;
        private Integer anioInicio;
        private String nomPlan;

        public plan(Integer idPlan, Integer anioInicio, String nomPlan){
            this.anioInicio = anioInicio;
            this.idPlan = idPlan;
            this.nomPlan = nomPlan;
        }

        public Integer getanioInicio() { return anioInicio;}
        public Integer getidPlan() {return idPlan;}
        public String getnomPlan() {return nomPlan;}
    }

    public class carrera{
        private Integer idCarrera;
        private String nomCarrera;

        public carrera(Integer idCarrera, String nomCarrera){
            this.idCarrera = idCarrera;
            this.nomCarrera = nomCarrera;
        }

        public Integer getidCarrera(){return idCarrera;}
        public String getnomCarrera(){return nomCarrera;}
    }

    public static void main(String[] args) {
        
    }
}
