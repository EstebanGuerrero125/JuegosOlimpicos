/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaejercicios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion{

    Connection con;

    String URL = "jdbc:mysql://localhost:3306/juegosOlimpicos";
    String USERNAME = "root";
    String PASSWORD = "";

    public Connection Conexion() {
      
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexion con la Base de datos exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }


}