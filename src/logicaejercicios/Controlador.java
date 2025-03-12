/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicaejercicios;

import java.util.*;
import javax.accessibility.AccessibleRole;
import modelo.Deportista;
import modelo.*;

/**
 *
 * @author user
 */
public class Controlador {

    public static int cont = 0;
    public static Scanner sc = new Scanner(System.in);
    public static Controlador controlador = new Controlador();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Bienvenido a los juegos olímpicos 2026");

       
        
        
        controlador.menu();
        

        
    }
    
        void menu() throws InterruptedException{
            
            
             System.out.println("-----Menu--------- \n"
                + "| 1. Agregar deportista       | \n"
                + "| 2. Agregar evento           | \n"
                + "| 3. Simular evento           | \n"
                + "| 4. Mostar ranking de paises | \n");
             
        System.out.print("Ingrese una opcion: ");
        int elegir = sc.nextInt();
        
              switch (elegir) {
            case 1 -> {
                //reiniciar contador de Do-While
                cont=0;
                
                do{
                
                System.out.println("Buena la rata:1 ");
                Deportista dep = new Deportista();
                DeportistaDAO depdao = new DeportistaDAO();

                System.out.println("Ingrese el DNI del deportista");
                String dni = sc.next();
                sc.nextLine();
                System.out.println("Ingrese el nombre del deportista");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el pais del deportista");
                String pais = sc.next();

                dep.setDni(dni);
                dep.setNombre(nombre);
                dep.setPais(pais);
                depdao.agregar(dep);
                
                    System.out.println(" Presione (1) si termino, si no ha terminado presione otro numero ");
                    cont = sc.nextInt();
                    
                }while(cont!=1);
                
                controlador.menu();
            }
            case 2 -> {
                
                do{
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

                System.out.println(" Presione (1) si termino, si no ha terminado presione otro numero ");
                cont = sc.nextInt();
                
                }while(cont !=1);
                
                controlador.menu();
            }

            case 3 -> {
                Participaciones part = new Participaciones();
                ParticipacionesDAO partdao = new ParticipacionesDAO();

                do {
                    System.out.println("Ingrese el DNI del participante");
                    String dniParticipacion = sc.next();

                    System.out.println("Ingrese el nombre del evento");
                    String eventoParticipacion = sc.next();
                              
                    part.setDni(dniParticipacion);
                    part.setEvento(eventoParticipacion);
                    partdao.agregar(part);

                    System.out.println("Presione (1) si termino, si no ha terminado presione otro numero ");
                    cont = sc.nextInt();

                } while (cont != 1);

                System.out.println("Simulando evento...");
                Thread.sleep(2000);

                List listaParti = partdao.simular();
                //System.out.println("PUESTO# NOMBRE DEPORTISTA PAIS DEPORTISTA----EVENTO");

                for (int i = 0; i < listaParti.size(); i++) {
                    int j=i+1;
                    System.out.println( "\n Puesto: ->"+ j + "\n"+ listaParti.get(i)  );
                }

                controlador.menu();    
            }
            
            case 4 -> {
                System.out.println("Rankin de paises con mas medallas ganadas:\n ");
                
            
            }
            default ->{
                  System.out.println("Opción no válida");
                controlador.menu();

            }
             
        }
    
        }

}
