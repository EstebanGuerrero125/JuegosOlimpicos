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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        
        switch(elegir) {
            case 1 -> {
                System.out.println("Buena la rata:1 " );
                Deportista dep = new Deportista();
                DeportistaDAO depdao = new DeportistaDAO();
                
                System.out.println("Ingrese por favor el DNI del deportista");
                String dni = sc.next();
                System.out.println("Ingrese por favor el nombre del deportista");
                String nombre = sc.next();
                System.out.println("Ingrese por favor el pais del deportista");
                String pais =sc.next();
                
                dep.setDni(dni);
                dep.setNombre(nombre);
                dep.setPais(pais);
                depdao.agregar(dep);
                
                
            }
            case 2 -> System.out.println("Buena la ra:2");
            default -> System.out.println("Opción no válida");
        }

    }
    
    

}
