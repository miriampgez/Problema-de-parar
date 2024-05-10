package Vista;

import Modelo.Controlador;
import Modelo.CuentaAtras;
import Modelo.CuentaInfinita;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class Vista extends JFrame {
    /* private JButton iniciarCuentaAtrasButton;
    private JButton iniciarCuentaInfinitaButton;
    private JTextArea textArea;

    public Ventana() {
        iniciarCuentaAtrasButton = new JButton("Iniciar Cuenta Atrás");
        iniciarCuentaAtrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CuentaAtras countdownController = new CuentaAtras(null);
                CuentaInfinita infiniteCountController = new CuentaInfinita();
                countdownController = new CuentaAtras(infiniteCountController);

                Reverser.reverse(countdownController, 5);
            }
        });

        iniciarCuentaInfinitaButton = new JButton("Iniciar Cuenta Infinita");
        iniciarCuentaInfinitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CuentaInfinita infiniteCountController = new CuentaInfinita();
                Reverser.reverse(infiniteCountController, 5);

                while(true) {
                    textArea.append("el Haltchecker deduce que el programa se dentendrá, por tanto el Reverser inicia un bucle infinito\n");
                }
            }
        });

        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setLayout(new FlowLayout());
        this.add(iniciarCuentaAtrasButton);
        this.add(iniciarCuentaInfinitaButton);
    }
}*/
   // private CuentaAtras cuentaAtras;
    //private CuentaInfinita cuentaInfinita;

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

    private void empezarCuentaAtras(Controlador countdownController) {
        new Thread(() -> {
            countdownController.execute(5);
        }).start();
    }

    private void empezarCuentaInfinita(Controlador infinitecountController) {
        new Thread(() -> {
            infinitecountController.execute(0);
        }).start();

        JOptionPane.showMessageDialog(this, "El Haltchecker deduce que el programa se detendrá, por tanto el Reverser inicia un bucle infinito");
    }
}


