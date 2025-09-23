package PracticaParcial1;

import java.util.ArrayList;
import java.util.Scanner;

public class Auto {
    private Boolean alquilado;
    private String modelo;
    private String patente;
    private String marca;
    
    public Auto(Boolean alquilado, String modelo, String patente, String marca) {
        this.alquilado = alquilado;
        this.modelo = modelo;
        this.patente = patente;
        this.marca = marca;
    }

    public Boolean getAlquilado() {
        return alquilado;
    }

    public void setAlquilado(Boolean alquilado) {
        this.alquilado = alquilado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Registrar auto
    public static void registrarAuto(ArrayList<Auto> autos) {
        System.out.println("Ingrese la marca del auto:");
        Scanner scanner = new Scanner(System.in);
        String marca = scanner.nextLine();
        System.out.println("Ingrese el modelo del auto:");
        String modelo = scanner.nextLine();
        System.out.println("Ingrese la patente del auto:");
        String patente = scanner.nextLine();
        Auto auto = new Auto(false, modelo, patente, marca);
        System.out.println("Auto registrado: " + auto.getMarca() + " " + auto.getModelo() + ", Patente: " + auto.getPatente());
        autos.add(auto);
    }

    //Listar autos disponibles (no alquilados)
    public static void listarAutos(ArrayList<Auto> autos, Cliente cliente, ArrayList<Alquiler> alquileres) {
        for (Auto auto : autos) {
            if (auto.getAlquilado() == false) {
                System.out.println("Marca: " + auto.getMarca() + ", Modelo: " + auto.getModelo() + ", Patente: " + auto.getPatente());
                System.out.println("-------------------");
            }
        }
        System.out.println("Seleccione un auto por su patente:");
        Scanner scanner = new Scanner(System.in);
        String patenteComp = scanner.nextLine();
        for (Auto auto : autos) {
            if (auto.getPatente().equals(patenteComp)) {
                System.out.println("Has seleccionado el auto:");
                System.out.println("Marca: " + auto.getMarca() + ", Modelo: " + auto.getModelo() + ", Patente: " + auto.getPatente());
                System.out.println("-------------------");
                auto.setAlquilado(true);
                System.out.println("Ingrese la cantidad de días que desea alquilar el auto:");
                Integer dias = scanner.nextInt();
                Alquiler.alquilarAuto(auto, alquileres, cliente, dias);
                break;
            } else {
                System.out.println("Patente no encontrada. Intente nuevamente.");
            }
        }

    }

    //Registrar devolucion
    public static void devolverAuto(ArrayList<Auto> autos, ArrayList<Alquiler> alquileres){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la patente del auto a devolver: ");
        String patenteComp = scanner.nextLine();
        for (Alquiler alquiler : alquileres) {
            if((alquiler.getAuto().getPatente().equals(patenteComp)) && (alquiler.getActivo() == true)){
                alquiler.getAuto().setAlquilado(false);
                alquiler.setActivo(false);
                System.out.println("Auto devuelto correctamente.");
                break;
            }
        }

        System.out.println("Autos disponibles:");
        for(Auto auto : autos){
            if (auto.getAlquilado() == false) {
                System.out.println("Marca: " + auto.getMarca() + ", Modelo: " + auto.getModelo() + ", Patente: " + auto.getPatente());
                System.out.println("-------------------");
            }
        }
    }

}
