package proyecto;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

public class ConexionTest {

    @Test
    public void testConexionBD() {
        Connection conn = ConexionDB.conectar();
        assertNotNull(conn, "La conexión a la BD no debería ser nula.");
    }
}