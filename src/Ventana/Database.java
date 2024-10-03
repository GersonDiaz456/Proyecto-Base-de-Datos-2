/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventana;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 * Creacion de la clase Database la cual permite la conexcion con la BD
 * @author DELL
 */
public class Database {
    private Connection conn;
    private String host = "localhost";
    private String port = "3306";
    private String dbName = "proyecto2";
    private String userName = "root";
    private String password = "Shadowdz1234";
    
    public Database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://" + this.host + ":" + this.port + "/" + this.dbName;
            conn = DriverManager.getConnection(url, this.userName, this.password);
            System.out.println("Conexion Exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectarse");
            e.printStackTrace();
        }
    }
    /**
     * Metodo el cual Guarda Datos en la Base de Datos
     * @param nombre
     * @param edad
     * @param nota1
     * @param nota2
     * @param nota3
     * @param nota4
     * @param promedio 
     */
      public boolean guardarDatos(String nombre, int edad, int nota1, int nota2, int nota3, int nota4, double promedio) {
        String query = "INSERT INTO alumnos (nombre, edad, nota1, nota2, nota3, nota4, promedio) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nombre);
            stmt.setInt(2, edad);
            stmt.setInt(3, nota1);
            stmt.setInt(4, nota2);
            stmt.setInt(5, nota3);
            stmt.setInt(6, nota4);
            stmt.setDouble(7, promedio);
            stmt.executeUpdate();
            System.out.println("Datos guardados exitosamente");
            return true; // Éxito en la inserción de datos
        } catch (SQLException e) {
            System.out.println("Error al guardar los datos");
            e.printStackTrace();
            return false; // Fallo en la inserción de datos
        }
    }
}