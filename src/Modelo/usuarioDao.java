/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static Modelo.Conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author EXO
 */
public class usuarioDao extends Conexion {

    PreparedStatement ps;
    ResultSet rs;
    Connection con = null;

    //Registrar
    public boolean registrar(usuario us) {
        String sql = "insert into usuario(id,nombre,email)values(?,?,?)";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, us.getId());
            ps.setString(2, us.getNombre());
            ps.setString(3, us.getEmail());
            ps.executeUpdate();
            con.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    //Buscar
    public boolean buscar(usuario us) {
        String sql = "select * from usuario where id = ?";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1,us.getId());
            rs = ps.executeQuery();
            while (rs.next()) {
              us.setId(rs.getInt("id"));
              us.setNombre(rs.getString("nombre"));
              us.setEmail(rs.getString("email"));
            }
            con.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    //Modificar
    public boolean modificar(usuario us) {
        String sql = "update usuario set nombre = ? , email = ? where id = ?";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getNombre());
            ps.setString(2, us.getEmail());
            ps.setInt(3, us.getId());
            ps.executeUpdate();
            con.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    //Eliminar
    public boolean eliminar(usuario us) {
        String sql = "delete from usuario where id = ?";
        try {
            con = getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1,us.getId());
            ps.executeUpdate();
            con.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
}
