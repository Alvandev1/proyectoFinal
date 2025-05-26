package proyecto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoginTest {
    
    @Test
    public void testInicioSesionCorrecto() {
        boolean resultado = proyectito.iniciarSesion("alvan", "Mhero");
        assertTrue(resultado, "El usuario y contraseña deberían ser correctos.");
    }

    @Test
    public void testInicioSesionIncorrecto() {
        boolean resultado = proyectito.iniciarSesion("usuario_falso", "clave_erronea");
        assertFalse(resultado, "El usuario no debería existir en la BD.");
    }
}