package Controlador;

import Modelo.Controlador;

public class HaltChecker {
    public static boolean check(Controlador controlador, int input) {
        try {
            Thread thread = new Thread(() -> {
                controlador.execute(input);
            });
            thread.start();
            Thread.sleep(2000);
            if (thread.isAlive()) {
                thread.interrupt();
                return false;
            } else {
                return true;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }
}
