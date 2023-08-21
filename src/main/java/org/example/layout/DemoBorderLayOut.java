package org.example.layout;

import lombok.Data;

import javax.swing.*;
import java.awt.*;

@Data
public class DemoBorderLayOut {


    private JPanel jpanel1;

    private JButton jButton;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;




public DemoBorderLayOut(){
    jpanel1 = new JPanel(new BorderLayout());

    jButton = new JButton("NORTH");
    jButton1 = new JButton("CENTER");
    jButton2 = new JButton("SOUTH");
    jButton3 = new JButton("WEST");
    jButton4 = new JButton("EAST");

    jButton.setForeground(Color.BLACK);
    jButton1.setForeground(Color.RED);
    jButton2.setForeground(Color.YELLOW);
    jButton3.setForeground(Color.GREEN);
    jButton4.setForeground(Color.BLUE);

    jpanel1.add(jButton, BorderLayout.NORTH);
    jpanel1.add(jButton1, BorderLayout.CENTER);
    jpanel1.add(jButton2, BorderLayout.SOUTH);
    jpanel1.add(jButton3, BorderLayout.WEST);
    jpanel1.add(jButton4, BorderLayout.EAST);
}


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
