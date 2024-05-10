package Controlador;

import Modelo.Controlador;

public class HaltChecker {
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
