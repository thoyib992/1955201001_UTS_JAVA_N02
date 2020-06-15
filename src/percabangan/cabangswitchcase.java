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
public class cabangswitchcase {
    public static void main(String[] args) {
        String lampu;
        Scanner scan=new Scanner(System.in);
        System.out.println("inputkan nama warna lampu lalu lintas :");
        lampu=scan.nextLine();
        switch(lampu){
            case "merah":System.out.println("lampu merah, berhenti !!");break;
            case "kuning":System.out.println("lampu kuning, harap hati-hati!");break;
            case"hijau":System.out.println("lampu hijau, silakan jalan !");break;
            default:System.out.println("warna lampu salah!!");
        }
    }
}
