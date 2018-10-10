/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Asistensi3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAB_TI
 */
public class SerializationApp {
    public static void main(String[] args) {
        List<Participant> participants = new ArrayList<Participant>();
        participants.add(new Participant("Ahmad", "Riza", 22));
        participants.add(new Participant("Tegar", "Adi", 21));
        participants.add(new Participant("Faizin", "Wibu", 25));
        participants.add(new Participant("Selvi", "Granit", 20));
        System.out.println("Parcitipant : "+participants);
        SerializationDemo demo = new SerializationDemo();
        demo.serialize(participants, "/home/tegar/Documents/parcitipant.ser");
        System.out.println("Deserialize Object...");
        List<Participant> newList = demo.deserialize("/home/tegar/Documents/parcitipant.ser");
        System.out.println("New List : "+newList);
    }
}
