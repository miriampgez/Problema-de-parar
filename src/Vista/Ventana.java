package Vista;

import Controlador.Reverser;
import Modelo.CuentaAtras;
import Modelo.CuentaInfinita;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class Ventana extends JFrame {
    private JButton iniciarCuentaAtrasButton;
    private JButton iniciarCuentaInfinitaButton;

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
            }
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setLayout(new FlowLayout());
        this.add(iniciarCuentaAtrasButton);
        this.add(iniciarCuentaInfinitaButton);
    }
}

/* package Vista;

    public Ventana() {
        iniciarCuentaAtrasButton = new JButton("Iniciar Cuenta Atrás");
        iniciarCuentaAtrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CuentaAtras countdownController = new CuentaAtras(null);
                Reverser.reverse(countdownController, 5);
            }
        });

        iniciarCuentaInfinitaButton = new JButton("Iniciar Cuenta Infinita");
        iniciarCuentaInfinitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CuentaInfinita infiniteCountController = new CuentaInfinita();
                Reverser.reverse(infiniteCountController, 5);
            }
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setLayout(new FlowLayout());
        this.add(iniciarCuentaAtrasButton);
        this.add(iniciarCuentaInfinitaButton);
    }
}*/
