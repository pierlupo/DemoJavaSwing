package org.example.layout;

import lombok.Data;

import javax.swing.*;
import java.awt.*;

@Data
public class GridLayOutDemo {


    private JPanel jPanel;


    public GridLayOutDemo() {

        jPanel = new JPanel(new GridLayout(3, 3));

        for (int i = 1; i <= 9; i++) {

            JButton button = new JButton("b"+ i);
            button.addActionListener(e -> {
                System.out.println(((JButton)(e.getSource())).getText());
            });
        jPanel.add(button);
        }



    }
}
