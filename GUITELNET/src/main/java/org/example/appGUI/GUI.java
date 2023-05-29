package org.example.appGUI;

import org.example.testINtefraceGUi.*;

import javax.swing.*;
import java.awt.*;

public class GUI {
    private JFrame frame;
    private JTabbedPane panelEquipment;

    private JPanel SW, SGN, SGT;
    private JLabel ip;
    private JTextField ipField;

    private JLabel login;
    private JTextField loginField;
    private JLabel password;
    private JPasswordField passwordField;
    private JButton connectButton;

    public GUI() {
        // Crează fereastra principală
        frame = new JFrame("Telnet Connection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new GridLayout(1, 2));



        panelEquipment = new JTabbedPane();
        panelEquipment.setSize(1000, 600);

        panelEquipment.setBackground(Color.gray);

        panelEquipment.add("SW",
                new PanelSW().panelConfigurationSW());
        panelEquipment.setVisible(true);
        frame.add(panelEquipment);
        frame.setVisible(true);


    }


}

