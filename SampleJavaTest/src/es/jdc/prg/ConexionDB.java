package es.jdc.prg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
	
    public static Connection obtenerConexion() throws SQLException {
        String url = "jdbc:mysql://weruleapp.es/Cuestionarios?useUnicode=true&characterEncoding=UTF-8";
        String usuario = "pablo";
        String contraseña = "Colegiado97!";
        return DriverManager.getConnection(url, usuario, contraseña);
    }
    
}
