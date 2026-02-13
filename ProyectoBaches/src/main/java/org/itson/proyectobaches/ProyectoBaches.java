/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.itson.proyectobaches;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author axelm
 */
public class ProyectoBaches {
    
    private static final String URL = "jdbc:mysql://localhost:3306/MyDatabase"; //Esto casi siempre es igual, solo checar el port y el nombre de la base de datsos
    private static final String USER = "root"; //El usuario donde esta la base de datos
    private static final String PSW = "itson"; //La contraseña de ese usuario
    
    /*
     * Es la sintaxis para crear la conexion a mysql  
    */
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL,USER,PSW);
    }
    
    public static void crearTabla() throws SQLException{
        String sql = "CREATE TABLE IF NOT EXISTS clientes ("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "nombre VARCHAR(100),"
                + "password VARCHAR(100)"
                + ");";
        try(Connection con = getConnection();
            Statement st = con.createStatement();){
            st.execute(sql);
            System.out.println("Tabla creada con exito");
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }    
    }
    
    public static void obtenerClientes(){
        String sql = "SELECT * FROM clientes";
        try(Connection con = getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);){
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                System.out.println("Id: " + id + " Nombre: " + nombre);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public static boolean loginSeguro(String nombre, String password){
        String sql = "SELECT * FROM clientes WHERE nombre=? AND password=?";
        try(Connection con = getConnection();
        PreparedStatement pst = con.prepareStatement(sql);){
            pst.setString(1, nombre);
            pst.setString(2, password);
            try(ResultSet rs = pst.executeQuery()){
                return rs.next();
            }catch(SQLException ex){
                ex.printStackTrace();
                return false;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        
    }
}
