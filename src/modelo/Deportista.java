/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author user
 */
public class Deportista {
    String Id;
    String Dni;
    String nombre;
    String pais;

    public Deportista() {
    }

    public Deportista(String Id, String Dni, String nombre, String pais) {
        this.Id = Id;
        this.Dni = Dni;
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
  void mostrarDatos(){
      System.out.println("Nombre: "+ nombre+" Pais: "+pais );
  }
}
