/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author EXO
 */
public class Conexion {
    
    public static String url = "jdbc:derby://localhost:1527/mybd";
    public static String user = "root";
    public static String password = "root";
    
    public static Connection getConexion(){
        Connection con = null;
        try{
          Class.forName("org.apache.derby.jdbc.ClientDriver");
          con = (Connection)DriverManager.getConnection(url,user,password);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        return con;
    }
}
