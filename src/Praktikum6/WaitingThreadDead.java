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
public class WaitingThreadDead extends Thread{
    public void run(){
        System.out.println("This thread feels a little ill");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
    }
    
    public static void main(String[] args) throws java.io.InterruptedIOException, InterruptedException{
        Thread dying = new WaitingThreadDead();
        dying.start();
        System.out.println("Waiting for thread death");
        dying.join();
        System.out.println("Thread has died");
    }
}
