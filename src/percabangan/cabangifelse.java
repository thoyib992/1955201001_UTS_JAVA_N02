/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class cabangifelse {
    public static void main(String[] args) {
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);
        System.out.println("nama : ");
        nama = scan.nextLine();
        System.out.println("nilai : ");
        nilai = scan.nextInt();
        
        if(nilai >= 70){
        System.out.println("selamat"+ nama +"anda lulus");
        
        }
        else{
            System.out.println("maaf"+ nama +"anda gagal");
            }
    }
 
}
