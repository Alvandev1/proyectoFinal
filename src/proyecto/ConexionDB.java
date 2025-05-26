package proyecto;

import java.sql.Connection;
import java.sql.SQLException;

public class ConexionDB {
    public static Connection conectar() {
        try {
            // Instanciar la conexión con los parámetros correctos
        	ConexionMySQL conexion = new ConexionMySQL("root", "", "proyecto");
            
            // Llamar al método para conectar con la base de datos
            conexion.conectar();
            
            // Retornar la conexión establecida
            return conexion.getConnection(); // Asegúrate de que ConexionMySQL tenga un método getConnection()
            
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar con la base de datos.");
            e.printStackTrace();
            return null;
        }
    }
}