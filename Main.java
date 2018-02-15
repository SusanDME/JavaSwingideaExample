package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                IniciodeSesion inicio = new IniciodeSesion();
                JFrame ventana69 = new JFrame("Inicio de Sesión");
                ventana69.setContentPane(inicio.getPanel());
                ventana69.pack();
                ventana69.setVisible(true);
            }
        });
    }
}
