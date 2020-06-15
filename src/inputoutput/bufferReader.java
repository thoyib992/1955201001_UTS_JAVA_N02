/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author pc
 */
public class bufferReader {
    public static void main(String[] args) throws IOException {
        String nama;
        //membuat objek input stream
        InputStreamReader isr = new InputStreamReader(System.in);
        //objek buffer
        BufferedReader br = new BufferedReader(isr);
        //mengisi variabel nama dengan buffereader
        System.out.println("Input nama :");
        nama = br.readLine();
        //tampilkan output isi variabel
        System.out.println("nama kamu adalah"+ nama);
    }
    
}
