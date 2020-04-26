/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author walter
 */
public class Usuario {
    private int idUsario;
    private String nombre;
    private String primerApellido;
    private String sedundoApellido;
    private String contrasena;    
    private String correo;
    private String direccion;
    private String nickname;
    private String contacto;
    private String cedula;
    private String tipoUsuario;

    
    public Usuario(int idUsario, String nombre, String primerApellido, String segundoApellido, String Contrasena,String correo,String direccion, String nickname, String contacto, 
            String cedula, String tipoUsuario){
     
        this.idUsario=idUsario;
        this.nombre=nombre;
        this.primerApellido=primerApellido;
        this.sedundoApellido=segundoApellido;
        this.contrasena=Contrasena;
        this.correo=correo;
        this.direccion=direccion;
        this.nickname=nickname;
        this.contacto=contacto;
        this.cedula=cedula;
        this.tipoUsuario=tipoUsuario;
} 
    
    public int getIdUsario() {
        return idUsario;
    }

    public void setIdUsario(int idUsario) {
        this.idUsario = idUsario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSedundoApellido() {
        return sedundoApellido;
    }

    public void setSedundoApellido(String sedundoApellido) {
        this.sedundoApellido = sedundoApellido;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
}
