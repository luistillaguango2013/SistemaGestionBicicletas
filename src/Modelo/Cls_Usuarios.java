/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author USUARIO1
 */
public class Cls_Usuarios {
    public String Str_usuario;
    public String Str_password;
    public String Str_correo;
    public String Str_telefono;
    public String Str_pregunta;

    public Cls_Usuarios(String Str_usuario, String Str_password, String Str_correo, String Str_telefono, String Str_pregunta) {
        this.Str_usuario = Str_usuario;
        this.Str_password = Str_password;
        this.Str_correo = Str_correo;
        this.Str_telefono = Str_telefono;
        this.Str_pregunta = Str_pregunta;
    }

    public String getStr_usuario() {
        return Str_usuario;
    }

    public void setStr_usuario(String Str_usuario) {
        this.Str_usuario = Str_usuario;
    }

    public String getStr_password() {
        return Str_password;
    }

    public void setStr_password(String Str_password) {
        this.Str_password = Str_password;
    }

    public String getStr_correo() {
        return Str_correo;
    }

    public void setStr_correo(String Str_correo) {
        this.Str_correo = Str_correo;
    }

    public String getStr_telefono() {
        return Str_telefono;
    }

    public void setStr_telefono(String Str_telefono) {
        this.Str_telefono = Str_telefono;
    }

    public String getStr_pregunta() {
        return Str_pregunta;
    }

    public void setStr_pregunta(String Str_pregunta) {
        this.Str_pregunta = Str_pregunta;
    }

 
    
}
