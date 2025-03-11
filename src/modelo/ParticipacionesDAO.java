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
        String sql = "INSERT INTO participaciones (Dni, Evento) VALUES(?,?)";
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
    
    public List simular(){
    /*  
        SELECT d.nombre, d.pais, p.evento 
        FROM deportista d  
        JOIN participaciones p ON d.dni = p.dni  
        ORDER BY RAND();
    */
        
        String sql= " SELECT d.nombre, d.pais, p.evento FROM deportista d JOIN participaciones p ON d.dni = p.dni ORDER BY RAND() ";
        List<Participaciones> lista = new ArrayList<>();

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Participaciones p = new Participaciones();
                p.setDeporNombre(rs.getString(1));
                p.setDeporPais(rs.getString(2));
                p.setEvento(rs.getString(3));
                lista.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar: " + e.getMessage());
        }
        return lista;
    }
    
}
