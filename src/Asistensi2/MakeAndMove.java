/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asistensi2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 *
 * @author tegar
 */
public class MakeAndMove {

    public static void main(String[] args) throws IOException {
        MakeAndMove mm = new MakeAndMove();
        String FromFile = "from.txt";
        String TargetFile = "destination.txt";

        mm.createFile(FromFile);
        mm.createFile(TargetFile);
        
        mm.setData(FromFile);

        mm.copyField(FromFile, TargetFile);
    }

    public void createFile(String name) {
        try {
            File file = new File("/home/tegar/Videos/" + name);

            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.close();

            System.out.println("File berhasil dibuat");
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }

    public void copyField(String from, String to) {
        FileInputStream instream = null;
        FileOutputStream outstream = null;

        try {
            File infile = new File("/home/tegar/Videos/" + from);
            File outfile = new File("/home/tegar/Videos/" + to);

            instream = new FileInputStream(infile);
            outstream = new FileOutputStream(outfile);

            byte[] buffer = new byte[4096];

            int length;
            while ((length = instream.read(buffer)) > 0) {
                outstream.write(buffer, 0, length);
            }

            instream.close();
            outstream.close();

            System.out.println("File berhasil dicopy!!");

        } catch (IOException ioe) {
            System.out.println(ioe);
        }

    }

    public void setData(String name) throws FileNotFoundException, IOException {
        String data = "";

        try {
            System.out.print("Tulis sesuatu : ");

            InputStream input = System.in;

            InputStreamReader reader = new InputStreamReader(input);

            BufferedReader bufReader = new BufferedReader(reader);

            String in = bufReader.readLine();

            data = in;
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }

        String path = ("/home/tegar/Videos/" + name);
        OutputStream output = new FileOutputStream(path);

        for (int i = 0; i < data.length(); i++) {
            output.write((byte) data.charAt(i));
        }

        output.close();

    }
}
