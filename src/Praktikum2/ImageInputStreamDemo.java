/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 *
 * @author tegar
 */
public class ImageInputStreamDemo {

    public static void main(String[] args) {
        Image image = null;
        try {
            String path = "/home/kaby/Documents/Android.jpg";
            File source = new File(path);
            image = ImageIO.read(source);

        } catch (IOException e) {
        }
        
        JFrame frame = new  JFrame();
        JLabel label = new JLabel(new  ImageIcon(image));
        frame.getContentPane().add(label,BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);

    }

}
