package com.xu.jdk8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton();
//        jButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("button pressed!!");
//            }
//        });
        jButton.addActionListener(e -> {
            System.out.println("button pressed!!");
        });
        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
