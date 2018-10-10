/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Asistensi3;

import java.io.Serializable;

/**
 *
 * @author LAB_TI
 */
public class Participant implements Serializable{

    private final String firstName;
    private final String lastName;
    private int age;

    public Participant(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName+" ("+age+")\n";
    }

}










