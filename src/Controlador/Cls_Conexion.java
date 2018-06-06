package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luis Tillaguango
 * @version 0.0.1
 */
//Esta clase permite la conexión con la base de datos qeu es MYSQL
public class Cls_Conexion {

    Connection cn;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/siutplbd", "root", "root");
            System.out.println("Se conecto exitosamente");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }

}
