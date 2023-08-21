package org.example.layout;


import lombok.Data;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Data
public class CardLayoutDemo {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("CardLayout");
        jFrame.setSize(400,400);
        jFrame.setBackground(Color.CYAN);
        jFrame.setContentPane(new FlowLayoutDemo().getJPanel());

        JPanel buttonPanel = new JPanel();
        JPanel cardPanel = new JPanel();
        JPanel card1 = new JPanel();
        JPanel card2 = new JPanel();

        JButton jButton1 = new JButton("Affiche card 1");
        JButton jButton2 = new JButton("Affiche card 2");

        CardLayout cardLayout =new CardLayout();

        cardPanel.setLayout(cardLayout);

        card1.setBackground(Color.RED);
        card1.add(new Label("card 1"));
        card2.setBackground(Color.GREEN);
        card2.add(new Label("card 2"));

        cardPanel.add(card1, "card1");
        cardPanel.add(card2, "card2");

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "card1");
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "card2");
            }
        });

        buttonPanel.add(jButton1);
        buttonPanel.add(jButton2);


        jFrame.setLayout(new BorderLayout());
        jFrame.add(cardPanel, BorderLayout.CENTER);
        jFrame.add(buttonPanel, BorderLayout.SOUTH);


        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
