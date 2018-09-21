/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author tegar
 */
public class AudioInputStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
          String path = "/home/kaby/Documents/a.mp3";
          InputStream in = new  FileInputStream(path);
          
          AudioStream audio = new AudioStream(in);
          
          AudioPlayer.player.start(audio);
          
        
    }
    
}
