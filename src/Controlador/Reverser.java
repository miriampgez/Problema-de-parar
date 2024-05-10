package Controlador;

import javax.swing.JOptionPane;

import Modelo.Controlador;
import Modelo.CuentaAtras;
import Modelo.CuentaInfinita;
import Vista.Vista;

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
