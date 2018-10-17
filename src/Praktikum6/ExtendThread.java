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
public class ExtendThread extends Thread{
    int threadNumber;
    
    public ExtendThread(int num){
        threadNumber = num;
    }
    
    public void rum(){
        System.out.println("I'm thread number : " + threadNumber);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(threadNumber + " is finished!");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Creating thread 1");
        Thread t1 = new ExtendThread(1);
        
        System.out.println("Creating thread 2");
        Thread t2 = new ExtendThread(2);
        
        t1.start();
        t2.start();
    }
}
