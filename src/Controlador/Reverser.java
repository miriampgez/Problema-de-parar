package Controlador;

import Modelo.Controlador;


public class Reverser {

    /**
     * Método que invierte el flujo de control del programa
     * @param controlador
     * @param input
     */

    public static void reverse(Controlador controlador, int input) {
        boolean halt = HaltChecker.check(controlador, input);

        if (halt) {
            // Si el HaltChecker indica que el controlador se detendrá, iniciamos un bucle infinito
            System.out.println("El Haltchecker deduce que el programa se detendrá, por tanto el Reverser inicia un bucle infinito");
            while (true) {
                // Bucle infinito
            }
        } else {
            // Si el HaltChecker indica que el controlador no se detendrá, terminamos inmediatamente
            System.out.println("El Haltchecker deduce que el programa no se detendrá, por tanto el Reverser termina inmediatamente");
        }
    }
}
