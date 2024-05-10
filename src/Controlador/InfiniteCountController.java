package Controlador;

import Modelo.Controlador;

import java.util.*;

public class InfiniteCountController implements Controlador {
    @Override
    public void execute(int input) {
        System.out.println("InfiniteCountController inicia la cuenta infinita con el valor inicial: " + input);
        int contador = input;
        while (true) {
            System.out.println("Cuenta infinita: " + contador);
            contador++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
