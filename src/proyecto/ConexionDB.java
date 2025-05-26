package proyecto;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Clase encargada de gestionar la conexión con la base de datos.
 * 
 * Utiliza la clase `ConexionMySQL` para establecer la conexión con 
 * la base de datos del proyecto.
 */
public class ConexionDB {

    /**
     * Establece una conexión con la base de datos MySQL utilizando la clase `ConexionMySQL`.
     * 
     * La conexión se inicializa con los parámetros necesarios, como el usuario, la contraseña 
     * y el nombre de la base de datos. Si ocurre un error, se captura y se muestra en la consola.
     * 
     * @return {@code Connection} si la conexión se establece correctamente, {@code null} si hay un error.
     */
    public static Connection conectar() {
        try {
            // Instanciar la conexión con los parámetros correctos.
            ConexionMySQL conexion = new ConexionMySQL("root", "", "proyecto");

            // Llamar al método para conectar con la base de datos.
            conexion.conectar();

            // Retornar la conexión establecida.
            return conexion.getConnection(); // Asegúrate de que ConexionMySQL tenga un método getConnection.

        } catch (SQLException e) {
            // Manejo de excepciones: muestra el error en la consola.
            System.out.println("❌ Error al conectar con la base de datos.");
            e.printStackTrace();
            return null;
        }
    }
}