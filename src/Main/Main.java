package Main;

import Modelo.Controlador;
import Modelo.CuentaInfinita;
import Vista.Vista;
import Controlador.CountDownController;
import Controlador.InfiniteCountController;
import Controlador.HaltChecker;
import Controlador.Reverser;


public class Main {
    public static void main(String[] args) {
        Controlador countdownController = new CountDownController(new CuentaInfinita());
        Controlador infiniteCountController = new InfiniteCountController();

        int input = 5;
        boolean halt = HaltChecker.check(countdownController, input);
        System.out.println("El controlador se detendrá con la entrada " + input + ": " + halt);

        Reverser.reverse(countdownController, input);
    }
}
