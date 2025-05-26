package proyecto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuteticacionJava {
    public static boolean iniciarSesion(String usuario, String contraseña) {
        Connection conn = ConexionDB.conectar();
        if (conn == null) return false;

        try {
            String query = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, usuario);
            stmt.setString(2, contraseña); // ⚠️ Se recomienda usar hashing aquí

            ResultSet rs = stmt.executeQuery();
            return rs.next(); // Si encuentra el usuario, la autenticación es exitosa

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}