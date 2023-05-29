package org.example.appTelnetConfig;


import org.example.appGUI.PanelCMD;
import org.example.appGUI.PanelSW;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Telnet {
    JPanel panelOutpput;
    private JTextArea outputTextArea;

    private void appendToPanel(JPanel panel, String text) {
        JTextArea textArea = new JTextArea(text);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(panel.getWidth(), 100));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        panel.add(scrollPane);
        panel.revalidate();
        panel.repaint();
    }

    private Socket socket;
    private InputStream inputStream;
    private OutputStream outputStream;
    private BufferedReader reader;
    private PrintWriter writer;


    public void connectTelnet(String ip, String login, String password, String typeEquipment) {
        try {
            socket = new Socket(ip, 23);
            inputStream = socket.getInputStream();

            outputStream = socket.getOutputStream();

            reader = new BufferedReader(new InputStreamReader(inputStream));
            writer = new PrintWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8), true);

            // Așteaptă mesajul de bun venit
            String welcomeMessage = reader.readLine();
            System.out.println("Welcome Message: " + welcomeMessage);
            // appendToPanel(panelOutpput, "Welcome Message: " + welcomeMessage);

            // Trimite login-ul
            writer.println(login);
            Thread.sleep(500);

            // Trimite parola
            writer.println(password);
            Thread.sleep(500);


         //   writer.println("show port all\n\n\n");

            // Așteaptă răspunsul de la server și afișează în consolă
            String response;
            while ((response = reader.readLine()) != null) {
                System.out.println(response);
                //    appendToPanel(panelOutpput, response);


            }
            // Închide conexiunea
              socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void reset(String ip, String login, String password, String typeEquipment) {
        try {
            socket = new Socket(ip, 23);
            inputStream = socket.getInputStream();

            outputStream = socket.getOutputStream();

            reader = new BufferedReader(new InputStreamReader(inputStream));
            writer = new PrintWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8), true);

            // Așteaptă mesajul de bun venit
            String welcomeMessage = reader.readLine();
            System.out.println("Welcome Message: " + welcomeMessage);
            // appendToPanel(panelOutpput, "Welcome Message: " + welcomeMessage);

            // Trimite login-ul
            writer.println(login);
            Thread.sleep(500);

            // Trimite parola
            writer.println(password);
            Thread.sleep(500);

            writer.println("reload\n");
            writer.println("y\n");
//            writer.flush();

            //   writer.println("show port all\n\n\n");

            // Așteaptă răspunsul de la server și afișează în consolă
            String response;
            while ((response = reader.readLine()) != null) {
                System.out.println(response);
                //    appendToPanel(panelOutpput, response);


            }
            // Închide conexiunea
              socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void createVLAN(String vlan,String nameVlan, String ip, String login, String password, String typeEquipment) {
        try {
            socket = new Socket(ip, 23);
            inputStream = socket.getInputStream();

            outputStream = socket.getOutputStream();

            reader = new BufferedReader(new InputStreamReader(inputStream));
            writer = new PrintWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8), true);

            // Așteaptă mesajul de bun venit
            String welcomeMessage = reader.readLine();
            System.out.println("Welcome Message: " + welcomeMessage);
            // appendToPanel(panelOutpput, "Welcome Message: " + welcomeMessage);

            // Trimite login-ul
            writer.println(login);
            Thread.sleep(500);

            // Trimite parola
            writer.println(password);
            Thread.sleep(500);

            writer.println("vlan database\n\n\n\n");
            writer.println("vlan " + vlan);
            writer.println("vlan name " + vlan + " " + nameVlan);
            writer.println("exit");
            writer.println("exit");

            // Așteaptă răspunsul de la server și afișează în consolă
            String response;
            while ((response = reader.readLine()) != null) {
                System.out.println(response);
                //    appendToPanel(panelOutpput, response);


            }
            // Închide conexiunea
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteVLAN(String vlan, String ip, String login, String password, String typeEquipment) {
        try {
            socket = new Socket(ip, 23);
            inputStream = socket.getInputStream();

            outputStream = socket.getOutputStream();

            reader = new BufferedReader(new InputStreamReader(inputStream));
            writer = new PrintWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8), true);

            // Așteaptă mesajul de bun venit
            String welcomeMessage = reader.readLine();
            System.out.println("Welcome Message: " + welcomeMessage);
            // appendToPanel(panelOutpput, "Welcome Message: " + welcomeMessage);

            // Trimite login-ul
            writer.println(login);
            Thread.sleep(500);

            // Trimite parola
            writer.println(password);
            Thread.sleep(500);

            writer.println("vlan database\n\n\n\n");
            writer.println("no  vlan " + vlan);
            writer.println("exit");

            // Așteaptă răspunsul de la server și afișează în consolă
            String response;
            while ((response = reader.readLine()) != null) {
                System.out.println(response);
                //    appendToPanel(panelOutpput, response);


            }
            // Închide conexiunea
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void allowVLAN(ArrayList<String> port,String vlan, String ip, String login, String password, String typeEquipment) {
        try {
            socket = new Socket(ip, 23);
            inputStream = socket.getInputStream();

            outputStream = socket.getOutputStream();

            reader = new BufferedReader(new InputStreamReader(inputStream));
            writer = new PrintWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8), true);

            // Așteaptă mesajul de bun venit
            String welcomeMessage = reader.readLine();
            System.out.println("Welcome Message: " + welcomeMessage);
            // appendToPanel(panelOutpput, "Welcome Message: " + welcomeMessage);

            // Trimite login-ul
            writer.println(login);
            Thread.sleep(500);

            // Trimite parola
            writer.println(password);
            Thread.sleep(500);

            writer.println("configure\n");
            writer.println("vlan participation all exclude " + vlan + "\n");
            for(String portInterface : port ){
                writer.println("interface " + portInterface + "\n");
                writer.println("vlan participation include " + vlan + "\n");
                writer.println("vlan tagging " + vlan + "\n");
                writer.println("exit");
            }

            writer.println("exit");
            writer.println("exit");

            // Așteaptă răspunsul de la server și afișează în consolă
            String response;
            while ((response = reader.readLine()) != null) {
                System.out.println(response);
                //    appendToPanel(panelOutpput, response);


            }
            // Închide conexiunea
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void enablePort(ArrayList<String> port, String ip, String login, String password, String typeEquipment) {
        try {
            socket = new Socket(ip, 23);
            inputStream = socket.getInputStream();

            outputStream = socket.getOutputStream();

            reader = new BufferedReader(new InputStreamReader(inputStream));
            writer = new PrintWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8), true);

            // Așteaptă mesajul de bun venit
            String welcomeMessage = reader.readLine();
            System.out.println("Welcome Message: " + welcomeMessage);
            // appendToPanel(panelOutpput, "Welcome Message: " + welcomeMessage);

            // Trimite login-ul
            writer.println(login);
            Thread.sleep(500);

            // Trimite parola
            writer.println(password);
            Thread.sleep(500);



            for(String portInterface : port ){
                writer.println("configure\n");
                writer.println("interface " + portInterface + "\n");
                writer.println("no shutdown \n");
                writer.println("exit");
                writer.println("exit");
            }


            writer.println("exit");

            // Așteaptă răspunsul de la server și afișează în consolă
            String response;
            while ((response = reader.readLine()) != null) {
                System.out.println(response);
                //    appendToPanel(panelOutpput, response);


            }
            // Închide conexiunea
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void disablePort(ArrayList<String> port, String ip, String login, String password, String typeEquipment) {
        try {
            socket = new Socket(ip, 23);
            inputStream = socket.getInputStream();

            outputStream = socket.getOutputStream();

            reader = new BufferedReader(new InputStreamReader(inputStream));
            writer = new PrintWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8), true);

            // Așteaptă mesajul de bun venit
            String welcomeMessage = reader.readLine();
            System.out.println("Welcome Message: " + welcomeMessage);
            // appendToPanel(panelOutpput, "Welcome Message: " + welcomeMessage);

            // Trimite login-ul
            writer.println(login);
            Thread.sleep(500);

            // Trimite parola
            writer.println(password);
            Thread.sleep(500);


            for (String portInterface : port) {
                writer.println("configure\n");
                writer.println("interface " + portInterface + "\n");
                writer.println("shutdown \n");
                writer.println("exit");
                writer.println("exit");
            }


            writer.println("exit");

            // Așteaptă răspunsul de la server și afișează în consolă
            String response;
            while ((response = reader.readLine()) != null) {
                System.out.println(response);
                //    appendToPanel(panelOutpput, response);


            }
            // Închide conexiunea
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//
}
