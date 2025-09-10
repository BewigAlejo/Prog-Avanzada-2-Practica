package Practico3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tp3Main {

    public static void generarEjemplar(Libro libro, List<Ejemplar> ejemplares) {
        Boolean prestado = false;
        Boolean sale = false;

        Ejemplar ejemplar = new Ejemplar(prestado, sale, libro);
        ejemplares.add(ejemplar);
        libro.setEjemplares(ejemplares);
        System.out.println("Ejemplar creado");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Cargar datos
        System.out.println("Ingrese el titulo del libro:");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese la edicion del libro:");
        Integer edicion = scanner.nextInt();

        //Crear autor, cargar los datos y aniadirlo a la list
        System.out.println("Ingrese el autor del libro:");
        Autor autor = new Autor(null, null); 
        String nombreAutor = scanner.nextLine();
        autor.setAutor(nombreAutor);
        List<Autor> autores = new ArrayList<Autor>();
        autores.add(autor);
        
        //Crear el libro con los datos q cargamos
        Libro libro = new Libro(titulo, edicion, null, autores, null);
        System.out.println("El libro creado es: " + libro.getTitulo() + " de " + libro.getAutores().get(0).getAutor() + ", edicion " + libro.getEdicion());
        
        //Instanciar 4 ejemplares y asociarlos al libro
        List<Ejemplar> ejemplares = new ArrayList<Ejemplar>();
        for(int i = 0; i<4 ; i++ ) {
            generarEjemplar(libro, ejemplares);
        }

        
        //Mostrar los datos del ejemplar
        for(Ejemplar ejemplar : libro.getEjemplares()) {
            System.out.println("Se va a mostrar un ejemplar ----------------------");
            System.out.println("Ejemplar Nro Inventario: " + ejemplar.getNroInventario() + ", Prestado: " + ejemplar.getPrestado() + ", Sale: " + ejemplar.getSale());
        }
        
    }
}
