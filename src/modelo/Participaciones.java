/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author user
 */
public class Participaciones {
    
    /* crear tabla participaciones
    CREATE TABLE participaciones(
    Dni varchar(128),
    Evento varchar(128),
    FOREIGN KEY (Dni) REFERENCES deportista (Dni),
    FOREIGN KEY (Evento) REFERENCES evento (Nombre)       
    )
    */
    
    String dni;
    String evento;
    String deporNombre;
    String deporPais;

    public Participaciones() {
    }

    public Participaciones(String dni, String evento, String deporNombre, String deporPais) {
        this.dni = dni;
        this.evento = evento;
        this.deporNombre = evento;
        this.deporPais = evento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getDeporNombre() {
        return deporNombre;
    }

    public void setDeporNombre(String deporNombre) {
        this.deporNombre = deporNombre;
    }

    public String getDeporPais() {
        return deporPais;
    }

    public void setDeporPais(String deporPais) {
        this.deporPais = deporPais;
    }
    
     public String toString() {
        return "Nombre: " + deporNombre + " Pais: " + deporPais +" Evento: " + evento ;
    }
    
    
}
