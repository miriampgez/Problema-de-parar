package Controlador;

import Modelo.Controlador;

public class HaltChecker {

    /**
     * Comprueba si el controlador ha terminado de ejecutarse después de una entrada determinada
     * @param controlador
     * @param input
     * @return
     */

    public static boolean check(Controlador controlador, int input) {
        try {
            Thread thread = new Thread(() -> {
                controlador.execute(input);
            });
            thread.start();
            thread.join(5000);
            return !thread.isAlive();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }
}
