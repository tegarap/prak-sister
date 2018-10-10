/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum4;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
/**
 *
 * @author tegar
 */
public class EchoClient {
    public static final int SERVICE_PORT = 7;
    public static final int BUFSIZE = 256;
    
    public static void main(String[] args) throws SocketException, IOException{
        String hostname = "localhost";
        InetAddress addr = InetAddress.getByName(hostname);
        DatagramSocket socket = new DatagramSocket();
        socket.setSoTimeout(2000);
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (;;){
            System.out.println("Write your message here...");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            PrintStream pout = new PrintStream(bout);
            pout.print(reader.readLine());
            
            byte[] barray = bout.toByteArray();
            
            DatagramPacket packet = new DatagramPacket(barray, barray.length, addr, SERVICE_PORT);
            System.out.println("Sending packet to " + hostname);
            socket.send(packet);
            
            System.out.println("Waiting for packet ...");
            
            byte[] recbuf = new byte[BUFSIZE];
            DatagramPacket receivePacket = new DatagramPacket(recbuf, BUFSIZE);
            
            boolean timeout = false;
            
            try {
                socket.receive(receivePacket);
            } catch (IOException e) {
                timeout = true;
            }
            
            if (!timeout) {
                System.out.println("packet received!");
                System.out.println("Details : " + receivePacket.getAddress());
                
                ByteArrayInputStream bin = new ByteArrayInputStream(
                        receivePacket.getData(), 0, receivePacket.getLength());
                
                BufferedReader reader2 = new BufferedReader(new InputStreamReader(bin));
                System.out.println(reader2.readLine());
            } else {
                System.out.println("packet lost !");
            }
 
        }
    }
}
