/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Asistensi3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LAB_TI
 */
public class Tugas3 {

    public static void showMenu() {
        System.out.println("------------------------");
        System.out.println("1. Insert Participant ");
        System.out.println("2. Update Participant");
        System.out.println("3. Delete Participant ");
        System.out.println("4. Print Participants ");
        System.out.println("5. Save Participants ");
        System.out.print("Pilih : ");

    }

    public static void main(String[] args) {

        final String fileName = "d:/tugas3_result_riza.ser";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Participant> parcList = new ArrayList<Participant>();
        SerializationDemo serializator = new SerializationDemo();
        while (true) {
            showMenu();
            try {
                int input = Integer.parseInt(br.readLine());

                String fName, lName;
                int age, idx;
                Participant p = null;
                switch (input) {
                    case 1:
                        System.out.println("#insert");
                        System.out.print("First Name : ");
                        fName = br.readLine();
                        System.out.print("Last Name : ");
                        lName = br.readLine();
                        System.out.print("Age: ");
                        age = Integer.parseInt(br.readLine());
                        p = new Participant(fName, lName, age);
                        parcList.add(p);
                        System.out.println(p + " added!!");
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("#update");
                        System.out.print("Index: ");
                        idx = Integer.parseInt(br.readLine());
                        System.out.print("First Name : ");
                        fName = br.readLine();
                        System.out.print("Last Name : ");
                        lName = br.readLine();
                        System.out.print("Age: ");
                        age = Integer.parseInt(br.readLine());
                        p = new Participant(fName, lName, age);
                        parcList.remove(idx);
                        parcList.add(idx, p);
                        System.out.println(p + " updated!!");
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("# delete");
                        System.out.print("Index: ");
                        idx = Integer.parseInt(br.readLine());
                        parcList.remove(idx);
                        System.out.println("No. " + idx + " deleted!!");
                        break;
                    case 4:
                        System.out.println("#print");
                        int i = 0;
                        for (Participant par : parcList) {
                            System.out.printf("%d. %s", i++, par);
                        }
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("#serializing participant");
                        serializator.serialize(parcList, fileName);
                        break;
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }


        }




    }
}
