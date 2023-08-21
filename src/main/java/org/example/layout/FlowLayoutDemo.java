package org.example.layout;


import lombok.Data;

import javax.swing.*;
import java.awt.*;

@Data
public class FlowLayoutDemo {

    JPanel jPanel = new JPanel(new FlowLayout());

    public FlowLayoutDemo() {

        jPanel.add(new JButton("Button1"));
        jPanel.add(new JButton("Button2"));
        jPanel.add(new JButton("Button3"));

    }
}
