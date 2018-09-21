/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asistensi1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author tegar
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/home/tegar/Videos/copy.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("/home/tegar/Videos/paste.txt");
            BufferedWriter bf = new BufferedWriter(fw);
            String line;
            line = br.readLine();
            while (line != null) {
                try {
                    bf.write(line, 0, line.length());
                    bf.newLine();
                    line = br.readLine();
                    System.out.println("data berhasil di copy");
                } catch (Exception e) {
                    System.out.println("data gagal di copy");
                }
            }
            br.close();
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
