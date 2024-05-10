package testModelo;

import org.junit.Test;
import static org.junit.Assert.*;

import Modelo.CuentaAtras;
import Modelo.Controlador;

public class CuentaAtrasTest {

        @Test
        public void testExecute() {
            Controlador siguienteControlador = new Controlador() {
                public void execute(int input) {
                }
            };

            CuentaAtras cuentaAtras = new CuentaAtras(siguienteControlador);
            assertTrue(true);
        }
}
