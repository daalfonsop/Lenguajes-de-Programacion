/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author walter
 */
public class Conexion {
    static Connection c = null;
    public static final String URL="jdbc:mysql://localhost:3306/fruithz";
    public static  final String USERNAME ="root";
    public static final String PASSWORD ="";
    
    public static Connection getConnection (){
        
        try {
            Class.forName("com.mysql.jdbc.Driver"); // llamo la libreria
            c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //System.out.println("conexion a base de datos exitosa");
            
        }catch (ClassNotFoundException | SQLException e) {
            System.out.println("no se conecto a la base de datos");
            e.printStackTrace(); //imprimir excepciones de java
        }
    
    return c;
    }
    public static void desconectarBd(){
        try{
            if (c !=null){
                c.commit();
                c.close();
            }
            c=null;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void desconectarSentencia (PreparedStatement sentencia) throws SQLException {
        if (sentencia != null){
            sentencia.close();
        }
        sentencia=null;
    }
}
