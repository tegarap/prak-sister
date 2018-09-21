/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author tegar
 */
public class FileOutputStreamData {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "/home/kaby/Documents/test.txt";
        OutputStream output = new FileOutputStream(path);
        System.out.println("Opened "+path+" for writing.");
        
        String data="try to write";
        for (int i = 0; i < data.length(); i++) {
            output.write((byte) data.charAt(i));
        }
        
        output.close();
        System.out.println("Close Stream");
    }

}
