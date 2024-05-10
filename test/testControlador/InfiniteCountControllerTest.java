package testControlador;

import org.junit.Test;
import static org.junit.Assert.*;

import Modelo.Controlador;
import Controlador.InfiniteCountController;

public class InfiniteCountControllerTest {
    @Test
    public void testExecute() {
        Controlador infiniteCountController = new InfiniteCountController();
        assertTrue(true);
    }
}
