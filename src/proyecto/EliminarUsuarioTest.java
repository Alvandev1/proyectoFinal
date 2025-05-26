package proyecto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EliminarUsuarioTest {

    @Test
    public void testEliminarUsuarioExistente() {
        entrada frame = new entrada(""); // Instancia de la ventana
        frame.eliminarUsuario("alvan", "Mhero"); // Eliminar usuario

        // Verificar que el usuario ha sido eliminado correctamente
        Connection conn = ConexionDB.conectar();
        try {
            String sqlCheck = "SELECT * FROM usuarios WHERE username = ?";
            PreparedStatement stmtCheck = conn.prepareStatement(sqlCheck);
            stmtCheck.setString(1, "alvan");
            ResultSet rs = stmtCheck.executeQuery();

            assertFalse(rs.next(), "El usuario aún existe en la BD después de ser eliminado.");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testEliminarUsuarioNoExistente() {
        entrada frame = new entrada("");
        frame.eliminarUsuario("usuario_inexistente", "clave_erronea");

        // No debería haber errores, pero el usuario tampoco debería existir
        Connection conn = ConexionDB.conectar();
        try {
            String sqlCheck = "SELECT * FROM usuarios WHERE username = ?";
            PreparedStatement stmtCheck = conn.prepareStatement(sqlCheck);
            stmtCheck.setString(1, "usuario_inexistente");
            ResultSet rs = stmtCheck.executeQuery();

            assertFalse(rs.next(), "El usuario nunca existió, no debería estar en la BD.");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
