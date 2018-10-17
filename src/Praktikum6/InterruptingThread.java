/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum6;

/**
 *
 * @author tegar
 */
public class InterruptingThread extends Thread{
    public void run(){
        System.out.println("I feel sleepy. Wake me in eight hours");
        try {
            Thread.sleep(1000 * 60 * 60 * 8);
            System.out.println("That was a nice nap");
        } catch (InterruptedException e) {
            System.err.println("Just five more minutes...");
        }
    }
    
    public static void main(String[] args) throws java.io.IOException{
        Thread sleepy = new InterruptingThread();
        sleepy.start();
        System.out.println("Press enter to interrupt the thread");
        System.in.read();
        sleepy.interrupt();
    }
}
