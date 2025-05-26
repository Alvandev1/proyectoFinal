package proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RecuperarContraseñaDAO {
    public static String recuperarCredenciales(String usuario, String email, String pin) {
        Connection conn = ConexionDB.conectar(); // Conectar con la base de datos
        if (conn == null) return "Error en la conexión";

        try {
            String sql = "SELECT username, password FROM usuarios WHERE username = ? AND email = ? AND pin = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, usuario);
            stmt.setString(2, email);
            stmt.setString(3, pin);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String nombreUsuario = rs.getString("username");
                String contraseña = rs.getString("password");
                return "Usuario: " + nombreUsuario + "\nContraseña: " + contraseña;
            } else {
                return "❌ No se encontró un usuario con esos datos.";
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "Error al recuperar credenciales.";
        }
    }
}