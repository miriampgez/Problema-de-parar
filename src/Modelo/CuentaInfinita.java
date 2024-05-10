package Modelo;

import javax.swing.*;

public class CuentaInfinita implements Controlador {
    @Override
    public void execute(int input) {
        int contador = input;
        while (true) {
            contador++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
