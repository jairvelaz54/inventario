/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventario;

/**
 *
 * @author jairk
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    // Ajusta estos valores según tu configuración de SQL Server
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=dojo;";
    private static final String USER = "tu_usuario";
    private static final String PASSWORD = "tu_contraseña";

    public static Connection getConexion() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return con;
    }
}
