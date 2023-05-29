package org.example.appGUI;

import org.example.appTelnetConfig.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PanelSW {
    private final String typeEquipment = "SW";
    private JPanel SW;
    private JLabel ip, login, password;
    private JTextField ipField, loginField;
    private JPasswordField passwordField;
    private JButton connectButton;
    private JButton reset;
    JCheckBox checkbox01;
    JCheckBox checkbox02;
    JCheckBox checkbox03;
    JCheckBox checkbox04;
    JCheckBox checkbox05;
    JCheckBox checkbox06;
    JCheckBox checkbox07;
    JCheckBox checkbox08;
    JCheckBox checkbox11;
    JCheckBox checkbox12;
    JCheckBox checkbox13;
    JCheckBox checkbox14;
    JCheckBox checkbox15;
    JCheckBox checkbox16;
    JCheckBox checkbox17;
    JCheckBox checkbox18;
    JCheckBox checkbox19;
    JCheckBox checkbox110;
    JCheckBox checkbox111;
    JCheckBox checkbox112;
    JCheckBox checkbox113;
    JCheckBox checkbox114;
    JCheckBox checkbox115;
    JCheckBox checkbox116;
    JCheckBox checkbox117;
    JCheckBox checkbox118;
    JCheckBox checkbox119;
    JCheckBox checkbox120;


    public Component panelConfigurationSW() {

        SW = new JPanel();
        // SW.setLayout(new GridLayout(2,1));
        JLabel messageTitleSW = new JLabel("SW CONTROLL");
        messageTitleSW.setBounds(250, 0, 100, 50);
        SW.add(messageTitleSW);

//        SW.setLayout(new GridLayout(3,1));

        ip = new JLabel("IP:");
        ip.setBounds(5, 40, 100, 20);
        ipField = new JTextField();
        ipField.setBounds(20, 40, 100, 20);
        SW.add(ip);
        SW.add(ipField);

        login = new JLabel("Login:");
        login.setBounds(150, 40, 100, 20);
        loginField = new JTextField();
        loginField.setBounds(190, 40, 100, 20);
        SW.add(login);
        SW.add(loginField);

        password = new JLabel("Password:");
        password.setBounds(320, 40, 100, 20);
        passwordField = new JPasswordField();
        passwordField.setBounds(390, 40, 100, 20);
        SW.add(password);
        SW.add(passwordField);

        connectButton = new JButton("Connect");
        connectButton.setBounds(520, 40, 100, 20);

        connectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ip = ipField.getText();
                String login = loginField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);
                Telnet telnet = new Telnet();

                telnet.connectTelnet(ip, login, password, typeEquipment);
            }
        });

        SW.add(connectButton);


        // inferface upllink and downlink

        JLabel interfaceSW = new JLabel("SW Interface");
        interfaceSW.setBounds(250, 50, 100, 50);
        SW.add(interfaceSW);
        // UPLINK
        checkbox01 = new JCheckBox("0/1");
        checkbox01.setBounds(0, 80, 50, 20);
        SW.add(checkbox01);


        checkbox02 = new JCheckBox("0/2");
        checkbox02.setBounds(50, 80, 50, 20);
        SW.add(checkbox02);


        checkbox03 = new JCheckBox("0/3");
        checkbox03.setBounds(100, 80, 50, 20);
        SW.add(checkbox03);


        checkbox04 = new JCheckBox("0/4", false);
        checkbox04.setBounds(150, 80, 50, 20);
        SW.add(checkbox04);

        checkbox05 = new JCheckBox("0/5", false);
        checkbox05.setBounds(200, 80, 50, 20);
        SW.add(checkbox05);

        checkbox06 = new JCheckBox("0/6", false);
        checkbox06.setBounds(250, 80, 50, 20);
        SW.add(checkbox06);

        checkbox07 = new JCheckBox("0/7", false);
        checkbox07.setBounds(300, 80, 50, 20);
        SW.add(checkbox07);

        checkbox08 = new JCheckBox("0/8", false);
        checkbox08.setBounds(350, 80, 50, 20);
        SW.add(checkbox08);

        // DOWNLINK

        checkbox11 = new JCheckBox("1/1", false);
        checkbox11.setBounds(0, 100, 50, 20);
        SW.add(checkbox11);

        checkbox12 = new JCheckBox("1/2", false);
        checkbox12.setBounds(50, 100, 50, 20);
        SW.add(checkbox12);

        checkbox13 = new JCheckBox("1/3", false);
        checkbox13.setBounds(100, 100, 50, 20);
        SW.add(checkbox13);

        checkbox14 = new JCheckBox("1/4", false);
        checkbox14.setBounds(150, 100, 50, 20);
        SW.add(checkbox14);

        checkbox15 = new JCheckBox("1/5", false);
        checkbox15.setBounds(200, 100, 50, 20);
        SW.add(checkbox15);

        checkbox16 = new JCheckBox("1/6", false);
        checkbox16.setBounds(250, 100, 50, 20);
        SW.add(checkbox16);

        checkbox17 = new JCheckBox("1/7", false);
        checkbox17.setBounds(300, 100, 50, 20);
        SW.add(checkbox17);

        checkbox18 = new JCheckBox("1/8", false);
        checkbox18.setBounds(350, 100, 50, 20);
        SW.add(checkbox18);

        checkbox19 = new JCheckBox("1/9", false);
        checkbox19.setBounds(400, 100, 50, 20);
        SW.add(checkbox19);

        checkbox110 = new JCheckBox("1/10", false);
        checkbox110.setBounds(450, 100, 50, 20);
        SW.add(checkbox110);


        checkbox111 = new JCheckBox("1/11", false);
        checkbox111.setBounds(0, 120, 50, 20);
        SW.add(checkbox111);

        checkbox112 = new JCheckBox("1/12", false);
        checkbox112.setBounds(50, 120, 50, 20);
        SW.add(checkbox112);

        checkbox113 = new JCheckBox("1/13", false);
        checkbox113.setBounds(100, 120, 50, 20);
        SW.add(checkbox113);

        checkbox114 = new JCheckBox("1/14", false);
        checkbox114.setBounds(150, 120, 50, 20);
        SW.add(checkbox114);

        checkbox115 = new JCheckBox("1/15", false);
        checkbox115.setBounds(200, 120, 50, 20);
        SW.add(checkbox115);

        checkbox116 = new JCheckBox("1/16", false);
        checkbox116.setBounds(250, 120, 50, 20);
        SW.add(checkbox116);

        checkbox117 = new JCheckBox("1/17", false);
        checkbox117.setBounds(300, 120, 50, 20);
        SW.add(checkbox117);

        checkbox118 = new JCheckBox("1/18", false);
        checkbox118.setBounds(350, 120, 50, 20);
        SW.add(checkbox118);

        checkbox119 = new JCheckBox("1/19", false);
        checkbox119.setBounds(400, 120, 50, 20);
        SW.add(checkbox119);

        checkbox120 = new JCheckBox("1/20", false);
        checkbox120.setBounds(450, 120, 50, 20);
        SW.add(checkbox120);


        JLabel interfaceSW1 = new JLabel("SW Command");
        interfaceSW1.setBounds(350, 150, 100, 50);
        SW.add(interfaceSW1);


        reset = new JButton("RESET SYSTEM");
        reset.setBounds(5, 190, 140, 30);
        SW.add(reset);

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String ip = ipField.getText();
                String login = loginField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);
                Telnet telnet = new Telnet();

                telnet.reset(ip, login, password, typeEquipment);

            }
        });




        JButton pingSW = new JButton("Ping SW");
        pingSW.setBounds(470, 190, 140, 30);
        SW.add(pingSW);

        pingSW.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PingWindow pingWindow = new PingWindow();
                pingWindow.Equipment(ipField.getText());
            }
        });


        JLabel text = new JLabel("Enter vlan  :");
        text.setBounds(5, 230, 70, 20);
        JTextField deleteVlanNr = new JTextField();
        deleteVlanNr.setBounds(5, 250, 70, 20);

        JButton deleteVlanNrinput = new JButton("delete vlan ");
        deleteVlanNrinput.setBounds(90, 230, 140, 40);

        deleteVlanNrinput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String ip = ipField.getText();
                String login = loginField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);
                Telnet telnet = new Telnet();

                telnet.deleteVLAN(deleteVlanNr.getText(), ip, login, password, typeEquipment);

            }
        });

        SW.add(text);
        SW.add(deleteVlanNr);
        SW.add(deleteVlanNrinput);


        JLabel text1 = new JLabel("Enter vlan  :");
        text1.setBounds(240, 230, 70, 20);

        JTextField createVLAN = new JTextField();
        createVLAN.setBounds(240, 250, 70, 20);

        JLabel text21 = new JLabel("Vlan name :");
        text21.setBounds(320, 230, 70, 20);
        JTextField createVLANname = new JTextField();
        createVLANname.setBounds(320, 250, 70, 20);

        JButton createVLANInput = new JButton("create vlan ");
        createVLANInput.setBounds(400, 230, 140, 40);

        SW.add(text1);
        SW.add(createVLAN);
        SW.add(createVLANInput);
        SW.add(text21);
        SW.add(createVLANname);

        createVLANInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String ip = ipField.getText();
                String login = loginField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);
                Telnet telnet = new Telnet();

                telnet.createVLAN(createVLAN.getText(), createVLANname.getText(), ip, login, password, typeEquipment);

            }
        });


        JLabel text2 = new JLabel("Enter vlan  :");
        text2.setBounds(5, 280, 70, 20);
        JTextField allowVLANinput = new JTextField();
        allowVLANinput.setBounds(5, 300, 70, 20);

        JButton allowVLAN = new JButton("allow vlan  ");
        allowVLAN.setBounds(90, 280, 140, 40);

        SW.add(text2);
        SW.add(allowVLANinput);
        SW.add(allowVLAN);

        allowVLAN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String ip = ipField.getText();
                String login = loginField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);
                Telnet telnet = new Telnet();
//                ArrayList<String> stringsport = (ArrayList<String>) verificationCheckBox();
                telnet.allowVLAN((ArrayList<String>) verificationCheckBox(),allowVLANinput.getText(), ip, login, password, typeEquipment);


            }
        });

        JButton enablePort = new JButton("enable port");
        enablePort.setBounds(160, 190, 140, 30);
        SW.add(enablePort);
        enablePort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String ip = ipField.getText();
                String login = loginField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);
                Telnet telnet = new Telnet();
//                ArrayList<String> stringsport = (ArrayList<String>) verificationCheckBox();
                telnet.enablePort((ArrayList<String>) verificationCheckBox(), ip, login, password, typeEquipment);


            }
        });

        JButton disablePort = new JButton("disable port");
        disablePort.setBounds(320, 190, 140, 30);
        SW.add(disablePort);

        disablePort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String ip = ipField.getText();
                String login = loginField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);
                Telnet telnet = new Telnet();
//                ArrayList<String> stringsport = (ArrayList<String>) verificationCheckBox();
                telnet.disablePort((ArrayList<String>) verificationCheckBox(), ip, login, password, typeEquipment);


            }
        });

        SW.setLayout(null);

        return SW;
    }

    private List<String> verificationCheckBox() {
        ArrayList<String> arrayList = new ArrayList<>();

        if(checkbox01.isSelected())
            arrayList.add(checkbox01.getText());

        if(checkbox02.isSelected())
            arrayList.add(checkbox02.getText());

        if(checkbox03.isSelected())
            arrayList.add(checkbox03.getText());

        if(checkbox04.isSelected())
            arrayList.add(checkbox04.getText());

        if(checkbox05.isSelected())
            arrayList.add(checkbox05.getText());

        if(checkbox06.isSelected())
            arrayList.add(checkbox06.getText());

        if(checkbox07.isSelected())
            arrayList.add(checkbox07.getText());

        if(checkbox08.isSelected())
            arrayList.add(checkbox08.getText());

        if(checkbox11.isSelected())
            arrayList.add(checkbox11.getText());

        if(checkbox12.isSelected())
            arrayList.add(checkbox12.getText());

        if(checkbox13.isSelected())
            arrayList.add(checkbox13.getText());

        if(checkbox14.isSelected())
            arrayList.add(checkbox14.getText());

        if(checkbox15.isSelected())
            arrayList.add(checkbox15.getText());

        if(checkbox16.isSelected())
            arrayList.add(checkbox16.getText());

        if(checkbox17.isSelected())
            arrayList.add(checkbox17.getText());

        if(checkbox18.isSelected())
            arrayList.add(checkbox18.getText());

        if(checkbox19.isSelected())
            arrayList.add(checkbox19.getText());

        if(checkbox110.isSelected())
            arrayList.add(checkbox110.getText());

        if(checkbox111.isSelected())
            arrayList.add(checkbox111.getText());

        if(checkbox112.isSelected())
            arrayList.add(checkbox112.getText());

        if(checkbox113.isSelected())
            arrayList.add(checkbox113.getText());

        if(checkbox114.isSelected())
            arrayList.add(checkbox114.getText());

        if(checkbox115.isSelected())
            arrayList.add(checkbox115.getText());

        if(checkbox116.isSelected())
            arrayList.add(checkbox116.getText());

        if(checkbox117.isSelected())
            arrayList.add(checkbox117.getText());

        if(checkbox118.isSelected())
            arrayList.add(checkbox118.getText());

        if(checkbox119.isSelected())
            arrayList.add(checkbox119.getText());

        if(checkbox120.isSelected())
            arrayList.add(checkbox120.getText());

        return arrayList;
    }

}
