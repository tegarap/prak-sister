/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asistensi6;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tegar
 */
public class Server {

    public static void main(String[] args) throws IOException {
        ArrayList<Thread> threadActive = new ArrayList<Thread>();
        int port = 2000;

        ServerSocket server = new ServerSocket(port);
        System.out.println("Server started");
        while (true) {
            Socket temp = server.accept();
            Thread newThread = new NextClient(temp, threadActive.size()+1);
            newThread.start();
            threadActive.add(newThread);
        }
    }
}

class NextClient extends Thread {

    Socket nextClient;
    int currentUser;

    NextClient(Socket nextClient, int currentUser) {
        this.nextClient = nextClient;
        this.currentUser = currentUser;
    }

    @Override
    public void run() {
        System.out.println("Client connect: " + nextClient.getInetAddress() +" - on port "+nextClient.getPort());

        try {
            OutputStream os = nextClient.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.println("Selamat datang! Anda pengunjung ke-"+currentUser);

            ps.flush();
            ps.close();
            nextClient.close();
        } catch (IOException ex) {
            Logger.getLogger(NextClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
