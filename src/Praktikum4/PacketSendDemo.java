/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author tegar
 */
public class PacketSendDemo {
    public static void main(String[] args) {
        System.out.println("Packet Send\n=============");
        String hostname = "localhost";
        
        System.out.println("Binding to a local port");
        try {
            DatagramSocket socket = new DatagramSocket();
            System.out.println("Bound to local port " + socket.getLocalPort());
            
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            PrintStream pout = new PrintStream(bout);
            pout.print("Assalamu'alaikum");
            
            byte[] barray = bout.toByteArray();
            
            DatagramPacket packet = new DatagramPacket(barray, barray.length);
            
            System.out.println("Looking up hostname " + hostname);
            InetAddress remote_addr = InetAddress.getByName(hostname);
            System.out.println("Hostname resolved as " + remote_addr.getHostAddress());
            
            packet.setAddress(remote_addr);
            
            packet.setPort(2000);
            
            socket.send(packet);
            System.out.println("Packet sent!");
            
        } catch (SocketException e) {
            System.out.println("Error : " + e.getMessage());
        } catch (IOException ex){
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
