/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author walter
 */
public class LogicaUsuario {
    ArrayList <Usuario> ListaUsuarios = new ArrayList<>();
    private Connection conexion= null;
    private PreparedStatement sentencias;
    private ResultSet rs;
    private Usuario usuario;
    
    public ArrayList<Usuario> obtenerListaUsuarios(){
        return ListaUsuarios;
    }
    public Usuario iniciaSesion (String user, String pass){
        try{
            conexion= Conexion.getConnection();
            sentencias = conexion.prepareStatement("select * from Usuario where  Usuario= ? and Pass= ?");
            sentencias.setString(1, user);
            sentencias.setString(2, pass);
            rs = sentencias.executeQuery(); // ejecuto en la base de datos
            
            if ( rs != null){
                while(rs.next()){
                    usuario = new Usuario();
                    usuario.setIdUsario(rs.getInt(1));
                    usuario.setNombre(rs.getString(2));
                    usuario.setPrimerApellido(rs.getString(3));
                    usuario.setSedundoApellido(rs.getString(4));
                    usuario.setContrasena(rs.getString(5));
                    usuario.setCorreo(rs.getString(6));
                    usuario.setDireccion(rs.getString(7));
                    usuario.setNickname(rs.getString(8));
                    usuario.setContacto(rs.getString(9));
                    usuario.setCedula(rs.getString(10));
                    usuario.setTipoUsuario(rs.getString(11));
                    ListaUsuarios.add(usuario); // en mi lista queda cargada toda la informacion
                    
                }
            }
            
            
            return usuario;     
                    
            }catch (Exception e){
            System.out.println("error en la consulta de la base de datos: "+ e.getMessage());
        }
        return null;
    }
    
}
