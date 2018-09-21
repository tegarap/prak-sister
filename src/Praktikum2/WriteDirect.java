/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 *
 * @author tegar
 */
public class WriteDirect {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       String data = "";
        
        try {
            System.out.print("Write Something : ");

            InputStream input = System.in;

            InputStreamReader reader = new InputStreamReader(input);

            BufferedReader bufReader = new BufferedReader(reader);

            String name = bufReader.readLine();

            data = name;
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }
        
        String path = "/home/kaby/Documents/test.txt";
        OutputStream output = new FileOutputStream(path);
      
        

        for (int i = 0; i < data.length(); i++) {
            output.write((byte) data.charAt(i));
        }

        output.close();
       
    }

}
