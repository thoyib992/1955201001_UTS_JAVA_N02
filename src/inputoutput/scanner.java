/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama,alamat;
        int usia,gaji;
        //membuat scanner baru
        Scanner keyboard= new Scanner(System.in);
        //tampilkan output ke user
        System.out.println("===PENDATAAN KARYAWAN PT.BERKAH JAVA===");
        System.out.println("Nama karyawan :");
        //menggunakan scanner dan menyimpan apa yang diketik di variabel lama
        nama = keyboard.nextLine();
        System.out.println("alamat        :");
        alamat = keyboard.nextLine();
        System.out.println("usia          :");
        usia = keyboard.nextInt();
        System.out.println("gaji          :");
        gaji = keyboard.nextInt();
        
        //menampilkan apa yang sudah disimpan di variabel
        System.out.println("=============================================");
        System.out.println("Nama karyawan: "+ nama);
        System.out.println("alamat       : "+ alamat);
        System.out.println("Usia         : "+ usia + "tahun");
        System.out.println("Gaji         : "+ gaji);
        // TODO code application logic here
    }
    
}
