package PracticaParcial2;

import java.util.ArrayList;
import java.util.Scanner;

public class Reserva {
    private Cliente cliente;
    private Mesa mesa;
    private Integer cantidadPersonas;
    private String fecha; // formato dd/mm/aaaa
    private String hora; // formato hh:mm
    private Integer estado; // 0 = pendiente, 1= confirmada, 2 = cancelada/finalizada

    public Reserva(Cliente cliente, Mesa mesa, Integer cantidadPersonas, String fecha, String hora, Integer estado) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.cantidadPersonas = cantidadPersonas;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(Integer cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public static void registrarReserva(ArrayList<Reserva> reservas, ArrayList<Cliente> clientes, ArrayList<Mesa> mesas,Scanner scanner) {
        System.out.println("Ingrese el DNI del cliente:");
        String dni = scanner.next();
        Integer encontrado = 0;

        try {
                for (Cliente cliente : clientes) {
                    if (cliente.getDni().equals(dni)) {
                        encontrado = 1;
                        System.out.println("Cliente encontrado: " + cliente.getNombre());
                        System.out.println("Ingrese la cantidad de personas para la reserva:");
                        Integer cantidadPersonas = scanner.nextInt(); scanner.nextLine(); 

                        // Mostrar mesas disponibles
                        System.out.println("Mesas disponibles:");
                        for (Mesa mesa : mesas) {
                            if (mesa.getEstado() == 0 && mesa.getCantidadMax() >= cantidadPersonas) {
                                System.out.println("Mesa ID: " + mesa.getId() + ", Capacidad: " + mesa.getCantidadMax());
                            }
                        }

                        System.out.println("Ingrese el ID de la mesa que desea reservar:");
                        Integer idMesa = scanner.nextInt(); scanner.nextLine(); 
                        Mesa mesaSeleccionada = null;
                        Integer mesaEncontrada = 0;


                        try {
                            for (Mesa mesa : mesas) {
                                    if (mesa.getId() == idMesa && mesa.getEstado() == 0 && mesa.getCantidadMax() >= cantidadPersonas) {
                                    mesaSeleccionada = mesa;
                                    mesaEncontrada = 1;
                                    break;
                                    }
                            }
                            if (mesaEncontrada == 0) {
                                throw new Exception("Mesa no disponible/no cumple con la capacidad requerida. Ingrese otro ID.");
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                            

                        if (mesaSeleccionada != null) {
                            System.out.println("Ingrese la fecha de la reserva (dd/mm/aaaa):");
                            String fecha = scanner.next();
                            System.out.println("Ingrese la hora de la reserva (hh:mm):");
                            String hora = scanner.next();
                            Integer estado = 0; // Pendiente al momento de crearla

                            Reserva nuevaReserva = new Reserva(cliente, mesaSeleccionada, cantidadPersonas, fecha, hora, estado);
                            reservas.add(nuevaReserva);
                            // Cambiar estado de la mesa a ocupada
                            mesaSeleccionada.setEstado(1);
                            System.out.println("Reserva registrada exitosamente.");
                        } else {
                            System.out.println("Mesa no disponible o no cumple con la capacidad requerida.");
                        }
                        break;

                    }
                }

                
                if(encontrado == 0) {
                        throw new Exception("Cliente no encontrado. Por favor, registre al cliente primero.");
                }
                
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    
}
