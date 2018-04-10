/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tssi.tp3.cartas.MySQL;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TechMDQ
 */
public class Conexion {

    private static Connection conn = null;

    public static Connection obtener() throws SQLException, ClassNotFoundException {
        if (conn == null) {
            try {
                Class.forName("con.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/juegocartas", "root", "cl14m5");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
        }
        return conn;
    }

    public static void cerrar() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
}
