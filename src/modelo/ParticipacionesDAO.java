/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import logicaejercicios.conexion;


/**
 *
 * @author user
 */
public class ParticipacionesDAO {
    
    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    
    public int agregar(Participaciones p) {
        String sql = "INSERT INTO participaciones (Dni, Evento,) VALUES(?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getDni());
            ps.setString(2, p.getEvento());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar: " + e.getMessage());
        }
        return r;
    }
    
}
