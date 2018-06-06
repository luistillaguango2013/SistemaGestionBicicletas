/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Luis Tillaguango
 * @version  0.0.1
 */
public class Cls_RolesUsuarios {
    public int Int_Id_usuario;
    public int Int_Id_rol;

    public Cls_RolesUsuarios(int Int_Id_usuario, int Int_Id_rol) {
        this.Int_Id_usuario = Int_Id_usuario;
        this.Int_Id_rol = Int_Id_rol;
    }

    public int getInt_Id_usuario() {
        return Int_Id_usuario;
    }

    public void setInt_Id_usuario(int Int_Id_usuario) {
        this.Int_Id_usuario = Int_Id_usuario;
    }

    public int getInt_Id_rol() {
        return Int_Id_rol;
    }

    public void setInt_Id_rol(int Int_Id_rol) {
        this.Int_Id_rol = Int_Id_rol;
    }
    
}
