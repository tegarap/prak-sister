/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author tegar
 */
public class LoopCheck {

    public static void main(String[] args) {

        try {

            System.out.println("Write text, Write exit for stop: ");
            String name = "";
            int i = 1;
            do {

                InputStream input = System.in;

                InputStreamReader reader = new InputStreamReader(input);

                BufferedReader bufReader = new BufferedReader(reader);

                name = bufReader.readLine();

                System.out.println(i + " Your write " + name);
                i++;
            } while (!name.equalsIgnoreCase("exit\n"));

            System.out.println("Thankyou");
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }

    }

}
