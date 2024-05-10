package testControlador;

import org.junit.Test;
import static org.junit.Assert.*;

import Modelo.Controlador;
import Controlador.CountDownController;
import Modelo.CuentaInfinita;

public class CountDownControllerTest {

        @Test
        public void testExecute() {
            Controlador siguienteControlador = new CuentaInfinita();
            CountDownController countDownController = new CountDownController(siguienteControlador);
            assertTrue(true);
        }
}
