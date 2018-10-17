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
public class StoppingThread extends Thread{
    public void run(){
        int count = 1;
        System.out.println("I can count. Watch me go!");
        for (;;) {
            System.out.print(count + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                
            }
        }
    }
    
    public static void main(String[] args) throws java.io.IOException{
        Thread counter = new StoppingThread();
        counter.start();
        System.out.println("Press any enter to stop the thread counting");
        System.in.read();
        counter.stop();
    }
}
