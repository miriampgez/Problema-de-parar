package Modelo;

public class CuentaAtras implements Controlador {
    private Controlador controlador;

    public CuentaAtras(Controlador controlador) {
        this.controlador = controlador;
    }

    public void execute(int input) {
        for (int i = input; i >= 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (controlador != null) {
            controlador.execute(input);
        }
    }
}
