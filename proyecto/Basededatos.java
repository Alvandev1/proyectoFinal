package proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Basededatos  {

	public static void main(String[] args) {
		try {
            // Instanciar la conexión con los parámetros correctos
        	ConexionMySQL conexion = new ConexionMySQL("sql7778803", "6WlQ2pqJsm", "sql7778803");
            
            // Llamar al método para conectar con la base de datos
            conexion.conectar();
            
            // Retornar la conexión establecida
            
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar con la base de datos.");
            e.printStackTrace();
  
	}
	}

	public static boolean registrarUsuario(String usuario, String apellido, String contraseña, String email, String pais, String genero) {
        Connection conn = conectar(); // Conectar con la base de datos
        if (conn == null) return false;

        try {
            String sql = "INSERT INTO usuarios (username, apellido, password, email, pais, genero) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, usuario);
            stmt.setString(2, apellido);
            stmt.setString(3, contraseña); // ⚠️ Se recomienda encriptar con hashing
            stmt.setString(4, email);
            stmt.setString(5, pais);
            stmt.setString(6, genero);

            return stmt.executeUpdate() > 0; // Devuelve `true` si se insertó correctamente

        } catch (SQLException e) {
            System.out.println("❌ Error al registrar usuario.");
            e.printStackTrace();
            return false;
        }
    }
}
