package Modelo;

public class CuentaInfinita implements Controlador {
    @Override
    public void execute(int input) {
        int i = input;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
