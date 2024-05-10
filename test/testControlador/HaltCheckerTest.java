package testControlador;

import org.junit.Test;
import static org.junit.Assert.*;

import Modelo.Controlador;
import Modelo.CuentaAtras;
import Modelo.CuentaInfinita;
import Controlador.HaltChecker;

public class HaltCheckerTest {

    @Test
    public void testCheckconHaltController() {
        Controlador haltController = new CuentaAtras(null); // No es necesario pasar un siguiente controlador para esta prueba
        boolean willHalt = HaltChecker.check(haltController, 5); // Por ejemplo, 5 como valor inicial
        assertTrue(willHalt);
    }

    @Test
    public void testCheckSinHaltController() {
        Controlador noHaltController = new CuentaInfinita();
        boolean willHalt = HaltChecker.check(noHaltController, 0); // Por ejemplo, 0 como valor inicial
        assertFalse(willHalt);
    }
}
