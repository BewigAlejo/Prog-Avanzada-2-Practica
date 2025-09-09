package Practico2Ejer2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class punto1Main {
    public static void main(String[] args) {
        // Instancia de dos areas
        Area area1 = new Area(1, "Area1", 1234, null);
        Area area2 = new Area(2, "Area2", 12345, null);

        //Instancia de dos expedientes
        Expediente expediente1 = new Expediente(1, 8092025, 1, "A", 2025, "Anexo1", area2, null);
        Expediente expediente2 = new Expediente(2, 8092025 , 2, "B", 2025, "Anexo2", area1, null);

        //Instancia de dos notas
        Nota nota1 = new Nota(1, 8092025, 1, 2025, "asunto1", area2, null);
        Nota nota2 = new Nota(2, 8092025, 2, 2025, "asunto2", area1, null);

        //Instancia de dos correspondencias
        Correspondencia correspondencia1 = new Correspondencia(1, 8092025, "remitente1", "direccion1", area2, null);
        Correspondencia correspondencia2 = new Correspondencia(2, 8092025, "remitente2", "direccion2", area1, null);

        // Se crean las listas de documentos para cada area, se les asigna cada documento y se setean en cada area
        List<Documento> documentosArea1 = new ArrayList<Documento>();
        documentosArea1.add(correspondencia2);
        documentosArea1.add(nota2);
        documentosArea1.add(expediente2);
        area1.setDocumento(documentosArea1);

        List<Documento> documentosArea2 = new ArrayList<Documento>();
        documentosArea2.add(expediente1);
        documentosArea2.add(correspondencia1);
        documentosArea2.add(nota1);
        area2.setDocumento(documentosArea2);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una fecha en formato dmmyyyy: ");
        Integer fechaComparar = entrada.nextInt();
        
        
            for (Documento doc : area1.getDocumento()) {
                if (doc.getFechaCreacion() == fechaComparar) {
                    System.out.println("El documento con ID " + doc.getId() + " fue creado en la fecha " + fechaComparar);
                }
            }
            for (Documento doc : area2.getDocumento()) {
                if (doc.getFechaCreacion() == fechaComparar) {
                    System.out.println("El documento con ID " + doc.getId() + " fue creado en la fecha " + fechaComparar);
                }
            }
        entrada.close();    
        

        
    }
}
