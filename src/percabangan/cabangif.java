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
public class cabangif {
    public static void main(String[] args) {
        int belanja=0;
        Scanner scan = new Scanner(System.in);
        //mengambil input
        System.out.println("total belanja : Rp.");
        belanja = scan.nextInt();
        if(belanja > 100000){
            System.out.println("selamat anda mendapat hadiah !!");
            
        }
        System.out.println("trimakasih....");
    }
}
