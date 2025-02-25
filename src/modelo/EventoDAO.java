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
public class EventoDAO {
     
    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public Evento buscar(String nombre) {
        Evento d = new Evento();
        String sql = "select * from evento where Nombre=" + nombre;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {              
                d.setNombre(rs.getString(1));
                d.setLugar(rs.getString(2));
                d.setFecha(rs.getString(3));

            }
        } catch (SQLException e) {
            System.out.println("Error buscar Evento: " + e.getMessage());
        }
        return d;
    }

    public List listar() {
        String sql = "select * from evento";
        List<Evento> lista = new ArrayList<>();

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Evento d = new Evento();
                d.setNombre(rs.getString(1));
                d.setLugar(rs.getString(2));
                d.setFecha(rs.getString(3));
                lista.add(d);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar: " + e.getMessage());
        }
        return lista;
    }

    public int agregar(Evento c) {
        String sql = "INSERT INTO evento (Nombre, Lugar, Fecha) VALUES(?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getLugar());
            ps.setString(3, c.getFecha());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al agregar: " + e.getMessage());
        }
        return r;
    }

    public int actualizar(Evento d) {
        String sql = "update evento set Nombre=?, Lugar=?, Fecha=? where IdEvento=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, d.getNombre());
            ps.setString(2, d.getLugar());
            ps.setString(3, d.getFecha());
            ps.setInt(4, d.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
        return r;
    }

    public void delete(int id) {
        String sql = "delete from evento where IdEvento=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }
    }
    
}
