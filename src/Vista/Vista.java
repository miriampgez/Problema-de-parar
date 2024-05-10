package Vista;

import Modelo.Controlador;
import Modelo.CuentaAtras;
import Modelo.CuentaInfinita;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class Vista extends JFrame {


    public Vista() {

        setTitle("PROBLEMA DE PARAR");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Controlador countdownController = new CuentaAtras(new CuentaInfinita());
        Controlador infinitecountController = new CuentaInfinita();

        JButton CuentaAtrasButton = new JButton("Iniciar Cuenta Atrás");
        CuentaAtrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                empezarCuentaAtras(countdownController);
            }
        });

        JButton CuentaInfinitaButton = new JButton("Iniciar Cuenta Infinita");
        CuentaInfinitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                empezarCuentaInfinita(infinitecountController);
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        panel.add(CuentaAtrasButton);
        panel.add(CuentaInfinitaButton);
        add(panel);

        setVisible(true);
    }

    /**
     * Método que inicia la cuenta atrás
     * @param countdownController
     */

    public void empezarCuentaAtras(Controlador countdownController) {
        new Thread(() -> {
            countdownController.execute(5);
        }).start();
        JOptionPane.showMessageDialog(this, "El Haltchecker deduce que el programa no se detendrá, por tanto el Reverser termina inmediatamente");
    }

    /**
     * Método que inicia la cuenta infinita
     * @param infinitecountController
     */
    
    public void empezarCuentaInfinita(Controlador infinitecountController) {
        new Thread(() -> {
            infinitecountController.execute(0);
        }).start();

        while (true) {
            // Bucle infinito
            JOptionPane.showMessageDialog(this, "El Haltchecker deduce que el programa se detendrá, por tanto el Reverser inicia un bucle infinito");
        }
    }
}


