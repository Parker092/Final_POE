/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Diego Palacios <diego.palacios2@catolica.edu.sv>
 */
public class Conexion {
    
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/poe_final?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String user = "root";
    private String password = "";

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException("Error de conexión a MySQL", e);
        } catch (ClassNotFoundException ex) {
           throw new RuntimeException("Error de conexión de Driver", ex);
        }
    }
}
