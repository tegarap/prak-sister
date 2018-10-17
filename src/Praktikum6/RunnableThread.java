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
public class RunnableThread implements Runnable{

    @Override
    public void run() {
        System.out.println("I am an instance of the java.lang.Runnable interface");
    }
    
    public static void main(String[] args) {
        System.out.println("Creating runnable project");
        
        //Create runnable object
        Runnable run = (Runnable) new RunnableThread();
        
        //Create a thread, and pass the runnable object
        System.out.println("");
        Thread t1 = new Thread(run);
        
        //Create a second threa, and pass the runnable object
        System.out.println("Creating second thread");
        Thread t2 = new Thread(run);
        
        //Start both threads
        System.out.println("Starting both threads");
        t1.start();
        t2.start();
    }
    
}
