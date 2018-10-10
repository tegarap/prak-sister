/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Asistensi3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LAB_TI
 */
public class ParcitipantSer implements Serializable{
    
    private String firstName;
    private String lastName;
    private int age;

    public ParcitipantSer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void printData(){
        System.out.printf("Nama\t: %s %s\n",firstName,lastName);
        System.out.printf("Usia\t: %s\n",age);
    }


    public void saveObject(ParcitipantSer obj){
        try {
            FileOutputStream fos = new FileOutputStream("d:/data.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.flush();
            fos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void readObject(){

        ObjectInputStream ois = null;
        ParcitipantSer obj = null;
        try {
            FileInputStream fis = new FileInputStream("d:/data.ser");
            ois = new ObjectInputStream(fis);
            obj = (ParcitipantSer) ois.readObject();
            obj.printData();
            fis.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ParcitipantSer is = new ParcitipantSer("Ahmad", "Riza", 20);
        is.saveObject(is);
        is.readObject();
    }
}










