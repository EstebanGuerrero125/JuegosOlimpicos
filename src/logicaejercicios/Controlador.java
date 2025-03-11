/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicaejercicios;

import modelo.Deportista;
import java.util.Scanner;
import modelo.*;

/**
 *
 * @author user
 */
public class Controlador {
    public static int cont = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Bienvenido a los juegos olímpicos 2026");
        
        System.out.println("-----Menu--------- \n"
                + "| 1. Agregar deportista       | \n"
                + "| 2. Agregar evento           | \n"
                + "| 3. Simular evento           | \n"
                + "| 4. Ver premiacion           | \n"
                + "| 5. Mostar ranking de paises | \n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una opcion: ");
        int elegir = sc.nextInt();

        switch (elegir) {
            case 1 -> {
                System.out.println("Buena la rata:1 ");
                Deportista dep = new Deportista();
                DeportistaDAO depdao = new DeportistaDAO();

                System.out.println("Ingrese por favor el DNI del deportista");
                String dni = sc.next();
                System.out.println("Ingrese por favor el nombre del deportista");
                String nombre = sc.next();
                System.out.println("Ingrese por favor el pais del deportista");
                String pais = sc.next();

                dep.setDni(dni);
                dep.setNombre(nombre);
                dep.setPais(pais);
                depdao.agregar(dep);

            }
            case 2 -> {
                System.out.println("Buena la ra:2");
                Evento event = new Evento();
                EventoDAO eventdao = new EventoDAO();

                System.out.println("Ingrese por favor el nombre del evento");
                String nombre = sc.next();
                System.out.println("Ingrese por favor el lugar del evento");
                String lugar = sc.next();
                System.out.println("Ingrese por favor la fecha del evento");
                String fecha = sc.next();

                event.setNombre(nombre);
                event.setLugar(lugar);
                event.setFecha(fecha);
                eventdao.agregar(event);

            }

            case 3 -> {
                Participaciones part = new Participaciones();

                
                do{
                    System.out.println("Ingrese el DNI del participante");
                    String dniParticipacion = sc.next();
                    part.setDni(dniParticipacion);
                    System.out.println("Ingrese el nombre del evento");
                    String eventoParticipacion = sc.next();
                    part.setEvento(eventoParticipacion);
                    
                    System.out.println("Presione (1) si no tiene mas participantes que anadir ");
                    cont = sc.nextInt();
                
                }while(cont != 1);
                
                System.out.println("Simuando evento...");
                Thread.sleep(2000);
                

            }
            default -> System.out.println("Opción no válida");
                
        }

    }

}
