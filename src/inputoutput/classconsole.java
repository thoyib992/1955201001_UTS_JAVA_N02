/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

import java.io.Console;

/**
 *
 * @author pc
 */
public class classconsole {

    public static void main(String[] args) {
        String nama;
        int usia;
        //membuat objek
        Console con = System.console();
        //mengisi variabel
        System.out.println("inputkan nama:");
        nama = con.readLine();
        System.out.println("inputkan usia:");
        usia = Integer.parseInt(con.readLine());
        //menampilkan isi
        System.out.println("nama kamu adalah : " + nama);
        System.out.println("saat ini berusia : " + usia + "tahun");
    }
}
