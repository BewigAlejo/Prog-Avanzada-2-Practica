package Practico2;
import java.util.ArrayList;
import java.util.List;

public class practico2Main {
    public static void main(String[] args) {
        //instanciar dos carreras
        ClaseCarrera carrera1 = new ClaseCarrera(1, "Ingenieria Informatica");
        ClaseCarrera carrera2 = new ClaseCarrera(2, "Arquitectura");

        //instanciar cuatro planes, dos para cada carrera
        ClasePlan plan1 = new ClasePlan(1, "Anual", 2025, null);
        ClasePlan plan2 = new ClasePlan(2, "Cuatrimestral", 2024, null);
        ClasePlan plan3 = new ClasePlan(3, "Anual", 2023, null);
        ClasePlan plan4 = new ClasePlan(4, "Cuatrimestral", 2022, null);

        //instanciar cuatro materias, dos para cada plan
        ClaseMateria materia1 = new ClaseMateria(1, "analisis1", 2025, plan4);
        ClaseMateria materia2 = new ClaseMateria(2, "algebra", 2025, plan4);
        ClaseMateria materia3 = new ClaseMateria(3, "fisica1", 2024, plan3);
        ClaseMateria materia4 = new ClaseMateria(4, "quimica", 2024, plan3);    

        //Asignar las materias a los planes (se debe crear un ArrayList de materias, cargarlo con las materias y asignarlo al plan con el set)
        List<ClaseMateria> materias = new ArrayList<>();
        materias.add(materia1);
        materias.add(materia2);
        plan1.setMaterias(materias);
        List<ClaseMateria> materias2 = new ArrayList<>();
        materias2.add(materia3);
        materias2.add(materia4);
        plan2.setMaterias(materias2);

        //Asignar los planes a las carreras
        List<ClasePlan> planes = new ArrayList<>();
        planes.add(plan4);
        planes.add(plan3);
        carrera1.setPlanes(planes);
        List<ClasePlan> planes2 = new ArrayList<>();
        planes2.add(plan1);
        planes2.add(plan2); 
        carrera2.setPlanes(planes2);

        //Mostrar por pantalla el nombre de la carrera, el nombre del plan y el nombre de las materias
        for(ClaseCarrera carrera : List.of(carrera1,carrera2)){
            System.out.println("Carrera: " + carrera.getNomCarrera());
            for(ClasePlan plan : carrera.getPlanes()){
                System.out.println(" Plan : " + plan.getNomPlan());
                for (ClaseMateria materia : plan.getMaterias()) {
                    System.out.println("  Materia: " + materia.getNomMat()  + " Año: " + materia.getAnioCursado());
                }
            }
        }



    }
}
