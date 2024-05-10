package Main;

import Modelo.Controlador;
import Modelo.CuentaInfinita;
import Vista.Vista;
import Controlador.CountDownController;
import Controlador.InfiniteCountController;
import Controlador.HaltChecker;
import Controlador.Reverser;

import javax.swing.*;


public class Main {

    /**
     * Método principal de la aplicación
     * @param args Argumentos de la línea de comandos
     */

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Vista();
            }
        });

        int input = 5;
        Controlador countdownController = new CountDownController(new CuentaInfinita());
        Controlador infiniteCountController = new InfiniteCountController();

        boolean halt = HaltChecker.check(countdownController, input);

        Reverser.reverse(infiniteCountController, input);
    }
}
