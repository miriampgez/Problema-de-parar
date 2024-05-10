package Controlador;

import javax.swing.JOptionPane;

import Modelo.Controlador;
import Modelo.CuentaAtras;
import Modelo.CuentaInfinita;
import Vista.Ventana;

public class Reverser {
   /* public static void reverse(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java reverser <Program_Code>");
            return;
        }

        try {
            Class c = Class.forName(args[0]);
            Controlador controlador = (Controlador) c.getDeclaredConstructor().newInstance();

            boolean halt = HaltChecker.check(controlador, 0);

            if (halt) {
                while (true) {
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }*/
    public static void reverse (Controlador controlador, int input) {
        boolean halt = HaltChecker.check(controlador, input);

        if (halt) {
            while (true) {
            }
        }
    }
}
