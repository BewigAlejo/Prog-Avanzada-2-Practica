package Practico4;


import java.util.List;
import java.util.Scanner;

public class Articulo {
    private String nombre;
    private Double precio;

    public Articulo(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    //Crud de articulo
    public static void createArticulo(List<Articulo> articulos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el precio del articulo: ");
        Double precio = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Seleccione el tipo de articulo: \n1. Electricidad \n2. Herramienta \n3. Generico");
        int var = scanner.nextInt();
        scanner.nextLine();
        switch (var) {
            case 1:
                // Crear articulo de Electricidad
                    Double potenciaMaxima;
                    System.out.println("Ingrese la potencia maxima del articulo: ");
                    potenciaMaxima = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Es un articulo industrial o domestico? \n1. Industrial \n2. Domestico  \3. Ninguno");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();
                    if (tipo == 1) {
                        // Crear articulo de Industrial
                            Double temperaturaMinima;
                            Double temperaturaMaxima;
                            System.out.println("Ingrese la temperatura minima del articulo: ");
                            temperaturaMinima = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.println("Ingrese la temperatura maxima del articulo: ");
                            temperaturaMaxima = scanner.nextDouble();
                            scanner.nextLine();
                            Industrial industrial = new Industrial(nombre, precio, potenciaMaxima, temperaturaMinima, temperaturaMaxima);
                            articulos.add(industrial);
                    }else if (tipo == 2) {
                        // Crear articulo de Domestico
                    }else if (tipo == 3) {
                        // Articulo de electricidad basico
                        Electricidad electricidad = new Electricidad(nombre, precio, potenciaMaxima);
                        articulos.add(electricidad);
                        System.out.println("Articulo de Electricidad creado con exito.");
                    }
                break;
            case 2:
                // Crear articulo de Herramienta
                    String descripcion;
                    System.out.println("Ingrese la descripcion del articulo: ");
                    descripcion = scanner.nextLine();
                    Herramientas herramienta = new Herramientas(nombre, precio, descripcion);
                    articulos.add(herramienta);
                    System.out.println("Articulo de Herramienta creado con exito.");
                break;
            case 3:
                    Articulo articulo = new Articulo(nombre, precio);
                    articulos.add(articulo);
                    System.out.println("Articulo creado exitosamente.");
                break;
            default:
                System.out.println("Tipo de articulo no valido.");
                
                break;
        }
    }

    public static void readArticulo(List<Articulo> articulos) {
        for (Articulo articulo : articulos) {
            System.out.println("Nombre: " + articulo.getNombre() + " - Precio: " + articulo.getPrecio());

            // Verificar si es Electricidad
            if (articulo instanceof Electricidad) {
                Electricidad e = (Electricidad) articulo;
                System.out.println("   Potencia máxima: " + e.getPotenciaMaxima());

                // Verificar si es Industrial
                if (articulo instanceof Industrial) {
                    Industrial i = (Industrial) articulo;
                    System.out.println("   Temp. mínima: " + i.getTemperaturaMinima());
                    System.out.println("   Temp. máxima: " + i.getTemperaturaMaxima());
                }

                // Verificar si es Domiciliaria 
            }

            // Verificar si es Herramienta
            if (articulo instanceof Herramientas) {
                Herramientas h = (Herramientas) articulo;
                System.out.println("   Descripción: " + h.getDescripcion());
            }
        }
    }

    public static void updateArticulo(List<Articulo> articulos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo a modificar: ");
        String nombreComp = scanner.nextLine();
          for (Articulo articulo : articulos) {
            if (articulo.getNombre() == nombreComp) {
                System.out.println("Ingrese el nuevo nombre del articulo: ");
                String nuevoNombre = scanner.nextLine();
                articulo.setNombre(nuevoNombre);
                System.out.println("Ingrese el nuevo precio del articulo: ");
                Double nuevoPrecio = scanner.nextDouble();
                articulo.setPrecio(nuevoPrecio);
                if (articulo instanceof Electricidad) {
                    Electricidad e = (Electricidad) articulo;
                    System.out.println("Ingrese la nueva potencia maxima del articulo: ");
                    Double nuevaPotencia = scanner.nextDouble();
                    e.setPotenciaMaxima(nuevaPotencia);
                    if (articulo instanceof Industrial) {
                        Industrial i = (Industrial) articulo;
                        System.out.println("Ingrese la nueva temperatura minima del articulo: ");
                        Double nuevaTempMin = scanner.nextDouble();
                        i.setTemperaturaMinima(nuevaTempMin);
                        System.out.println("Ingrese la nueva temperatura maxima del articulo: ");
                        Double nuevaTempMax = scanner.nextDouble();
                        i.setTemperaturaMaxima(nuevaTempMax);
                    }
                }
            }else {
                System.out.println("Articulo no encontrado.");
            }
          }
    }
     
    public static void deleteArticulo(List<Articulo> articulos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo a eliminar: ");
        String nombreComp = scanner.nextLine();
        for (Articulo articulo : articulos) {
            if (articulo.getNombre() == nombreComp) {
                articulos.remove(articulo);
                System.out.println("Articulo eliminado con exito.");
                break;
            }else {
                System.out.println("Articulo no encontrado.");
            }
        }
    }
}
