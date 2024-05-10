package Modelo;

import javax.swing.*;

public class CuentaAtras implements Controlador {
    private Controlador siguiente;

    public CuentaAtras(Controlador siguiente) {
        this.siguiente = siguiente;
    }

    public void execute(int input) {
        for (int i = input; i >= 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (siguiente != null) {
            siguiente.execute(input);
        }
    }
}
