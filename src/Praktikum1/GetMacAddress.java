/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author tegar
 */
public class GetMacAddress {

    public String getMac() throws UnknownHostException, SocketException {

        String macAddress = null;

        //mengambil internet address local host
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("Host \t:" + address.getHostName());
        System.out.println("IP \t:" + address.getHostAddress());

        
        NetworkInterface inteface = NetworkInterface.getByInetAddress(address);
        if(inteface!=null){
            System.out.println("Interface \t: "+inteface);
        byte[] mac = inteface.getHardwareAddress();
        

        //Menampilkan Mac Address
        StringBuilder sb = new StringBuilder();

        //convert mac address ke String
        for (int j = 0; j < mac.length; j++) {
            //System.out.print(mac[j]+":");
            sb.append(String.format("%02X%s", mac[j], (j < mac.length - 1) ? "-" : ""));
            
           
        }
        macAddress = sb.toString();
        }
        return macAddress;
        
        

    }

    public static void main(String[] args) throws UnknownHostException, SocketException {
        GetMacAddress run = new GetMacAddress();
        String mac = run.getMac();
        if(mac != null){
            System.out.println("Mac Address\t: " + mac);
        }else{
            System.out.println("Mac Address Not Found");
        }
        
    }

}
