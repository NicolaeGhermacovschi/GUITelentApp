package org.example;

import org.example.appGUI.GUI;

import javax.swing.*;
public class App
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
          new GUI();
            }
        });
    }
}
