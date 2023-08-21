package org.example;

import org.example.layout.DemoBorderLayOut;
import org.example.layout.FlowLayoutDemo;
import org.example.layout.GridBagLayoutDemo;
import org.example.layout.GridLayOutDemo;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

//                JFrame jFrame = new JFrame("DemoLayout");
//                jFrame.setSize(300, 600);
//                jFrame.setContentPane(new DemoBorderLayOut().getJpanel1());

//                JFrame jFrame = new JFrame("DemoLayout");
//                jFrame.setSize(600, 600);
//                jFrame.setContentPane(new GridLayOutDemo().getJPanel());

//                JFrame jFrame = new JFrame("FlowLayout");
//                jFrame.setSize(600, 600);
//                jFrame.setContentPane(new FlowLayoutDemo().getJPanel());

                JFrame jFrame = new JFrame("GridBagLayout");
                jFrame.setSize(600, 600);
                jFrame.setContentPane(new GridBagLayoutDemo().getJPanel());
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.setVisible(true);

            }
        });
    }
}