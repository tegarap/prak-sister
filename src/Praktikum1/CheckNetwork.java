/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author tegar
 */
public class CheckNetwork {
    public static void main(String[] args) throws UnknownHostException, IOException {
        //InetAddress address = InetAddress.getLocalHost();
        
        String jaringan = "192.168.1.";
        
        for (int i = 1; i <= 20; i++) {
            String ip = jaringan + i;
            InetAddress ia = InetAddress.getByName(ip);
            if (ia.isReachable(3000)) {
                System.out.println(ia.getHostAddress() + " Reachable");
            } else {
                System.out.println(ia.getHostAddress() + " unReachable");
            }
        }
    }
    
    
}
