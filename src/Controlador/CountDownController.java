package Controlador;

import Modelo.Controlador;

public class CountDownController implements Controlador {
    private Controlador next;

    public CountDownController(Controlador next) {
        this.next = next;
    }

    public void execute(int input) {
        System.out.println("CountdownController inicia la cuenta atrás con el valor inicial: " + input);
        if (next != null) {
            next.execute(input);
        }
    }
}
