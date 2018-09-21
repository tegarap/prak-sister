/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;/**
         *
         * @author tegar
         */


public class InputStreamToReaderDemo {

    public static void main(String[] args) {
        try {
            System.out.print("Enter Name : ");
            
            InputStream input= System.in;
            
            InputStreamReader reader = new InputStreamReader(input);
            
            BufferedReader bufReader = new BufferedReader(reader);
            
            String name= bufReader.readLine();
            
            System.out.print("My Name is "+name );
        } catch (IOException e) {
            System.out.println("Error : "+e);
        }

    }

}
