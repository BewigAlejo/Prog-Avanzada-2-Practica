package Practico2Ejer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    //Para generar documentos, primero debo generar un area
    //Luego genero el documento y le asigno el area
    public static void generarDocumento(Area area) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la fecha de creacion del documento: ");
        Integer fechaCreacion = entrada.nextInt();
        Documento doc = new Documento(fechaCreacion, null, area);
        System.out.println("El ID del documento es :" + doc.getId());
        
        //Genero un movimiento para el doc
        System.out.println("Desea generar un movimiento para este documento? (s/n) ");
        String respuesta = entrada.next();
        if (respuesta == "s" || respuesta == "S"){
            generarMovimiento(doc);     
        }
        entrada.close();
    }

    public static void generarArea() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del area: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el telefono del area: ");
        Integer telefono = entrada.nextInt();
        Area area = new Area(nombre, telefono, null);
        System.out.println("El ID del area es :" + area.getIdArea());
        entrada.close();
    }

    public static void generarMovimiento(Documento doc) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la fecha del movimiento: " );
        Integer fechaMovimiento = entrada.nextInt();
        Movimiento mov = new Movimiento(fechaMovimiento, doc);
        System.out.println("El ID del movimiento es :" + mov.getIdMovimiento());
        
        //Asigno el movimiento al doc
        List<Movimiento> movimientos = new ArrayList<Movimiento>();
        movimientos.add(mov);
        doc.setMovimiento(movimientos);
        entrada.close();
    }

    public static void encontrarArea(Documento doc){
        System.out.println("El area del documento con ID : " + doc.getId() + " es " + doc.getArea().getNombreArea());
    }

}
