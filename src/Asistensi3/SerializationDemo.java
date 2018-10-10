/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Asistensi3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author LAB_TI
 */
public class SerializationDemo {

    public void serialize(List<Participant> pList, String fileName) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(pList);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public List<Participant> deserialize(String fileName) {
        List<Participant> pList = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
            pList = (List<Participant>) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pList;
    }
}
