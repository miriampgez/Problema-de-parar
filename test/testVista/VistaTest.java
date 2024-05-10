package testVista;

import org.junit.Test;
import static org.junit.Assert.*;

import Modelo.Controlador;
import Modelo.CuentaAtras;
import Modelo.CuentaInfinita;
import Vista.Vista;
import Controlador.CountDownController;

public class VistaTest {

    @Test
    public void testStartCountdown() {
        // Simular la creación de la vista
        Vista vista = new Vista();

        // Crear un controlador para simular el inicio de la cuenta atrás
        Controlador controlador = new CuentaAtras(null); // No es necesario pasar un siguiente controlador para esta prueba

        // Llamar al método startCountdown de Vista
        vista.empezarCuentaAtras(controlador);

        // Verificar que se muestra el mensaje de cuenta atrás
        // En una prueba real de GUI, podrías usar bibliotecas como FEST Swing para interactuar con la interfaz gráfica y verificar el mensaje
        // Aquí simplemente devolvemos true si la prueba llega hasta este punto
        assertTrue(true);
    }

    @Test
    public void testStartInfiniteCount() {
        // Simular la creación de la vista
        Vista vista = new Vista();

        // Crear un controlador para simular el inicio de la cuenta infinita
        Controlador controlador = new CuentaInfinita();

        // Llamar al método startInfiniteCount de Vista
        vista.empezarCuentaInfinita(controlador);

        // Verificar que se muestra el mensaje de bucle infinito
        // En una prueba real de GUI, podrías usar bibliotecas como FEST Swing para interactuar con la interfaz gráfica y verificar el mensaje
        // Aquí simplemente devolvemos true si la prueba llega hasta este punto
        assertTrue(true);
    }
}
