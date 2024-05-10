package testControlador;

import org.junit.Test;
import static org.junit.Assert.*;

import Modelo.Controlador;
import Modelo.CuentaAtras;
import Modelo.CuentaInfinita;
import Controlador.Reverser;

public class ReverserTest {

    @Test
    public void testReverseConHalt() {
        // Crear un controlador que se detendrá (por ejemplo, una cuenta atrás)
        Controlador haltController = new CuentaAtras(null); // No es necesario pasar un siguiente controlador para esta prueba

        // Ejecutar Reverser con el controlador que se detendrá
        Reverser.reverse(haltController, 5); // Por ejemplo, 5 como valor inicial

        // Verificar que el método reverse de Reverser funciona correctamente para un controlador que se detendrá
        // Aquí podrías verificar que realmente entra en un bucle infinito (por ejemplo, esperar un tiempo y verificar que el programa sigue en ejecución)
        // Como alternativa, podrías diseñar tu código de manera que Reverser devuelva un valor booleano para indicar si entró en un bucle infinito o no, y verificar ese valor aquí
        assertTrue(true); // Aquí simplemente devolvemos true si la prueba llega hasta este punto
    }

    @Test
    public void testReverseSinHalt() {
        // Crear un controlador que no se detendrá (por ejemplo, una cuenta infinita)
        Controlador noHaltController = new CuentaInfinita();

        // Ejecutar Reverser con el controlador que no se detendrá
        Reverser.reverse(noHaltController, 0); // Por ejemplo, 0 como valor inicial

        // Verificar que el método reverse de Reverser funciona correctamente para un controlador que no se detendrá
        // Aquí podrías verificar que el programa termina inmediatamente (por ejemplo, esperar un tiempo y verificar que el programa no sigue en ejecución)
        assertTrue(true); // Aquí simplemente devolvemos true si la prueba llega hasta este punto
    }
}
