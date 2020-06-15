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
public class cabangdalamcabang {
    public static void main(String[] args) {
        int belanja,diskon,bayar;
        String kartu;
        Scanner scan=new Scanner(System.in);
        System.out.println("apakah ada kartu member ?? :");
        kartu=scan.nextLine();
        System.out.println("total belanjaan :");
        belanja=scan.nextInt();
        
        if(kartu.equalsIgnoreCase("ya")){
            if(belanja>500000){
                diskon =50000;
            }else if(belanja>100000){
                diskon=15000;
            }else{
                diskon=0;
            }
        }else{
            if(belanja>100000){
                diskon=5000;
            }else{
                diskon=0;
            }
        }
        bayar= belanja-diskon;
        System.out.println("total bayar : rp."+bayar);
    }
}
