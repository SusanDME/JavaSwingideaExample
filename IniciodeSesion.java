package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IniciodeSesion {
    private JButton aceptarButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton cancelarButton;
    private JPanel panel;


    public IniciodeSesion() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }
}
