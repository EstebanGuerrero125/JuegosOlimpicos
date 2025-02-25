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
public class DeportistaDAO {
    
    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public Deportista buscar(String dni) {
        Deportista d = new Deportista();
        String sql = "select * from deportista where Dni=" + dni;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {              
                d.setDni(rs.getString(1));
                d.setNombre(rs.getString(2));
                d.setPais(rs.getString(3));

            }
        } catch (SQLException e) {
            System.out.println("Error buscarClienteDAO: " + e.getMessage());
        }
        return d;
    }

    public List listar() {
        String sql = "select * from deportista";
        List<Deportista> lista = new ArrayList<>();

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Deportista d = new Deportista();
                d.setDni(rs.getString(1));
                d.setNombre(rs.getString(2));
                d.setPais(rs.getString(3));
                lista.add(d);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar: " + e.getMessage());
        }
        return lista;
    }

    public int agregar(Deportista c) {
        String sql = "INSERT INTO deportista (Dni, Nombre, Pais) VALUES(?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getDni());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getPais());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar: " + e.getMessage());
        }
        return r;
    }

    public int actualizar(Deportista d) {
        String sql = "update deportista set Dni=?, Nombre=?, Pais=? where IdDeportista=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, d.getDni());
            ps.setString(2, d.getNombre());
            ps.setString(3, d.getPais());
            ps.setInt(4, d.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        return r;
    }

    public void delete(int id) {
        String sql = "delete from deportista where IdDeportista=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }
    }
    
}
