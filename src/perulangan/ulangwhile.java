/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ulangwhile {
    public static void main(String[] args) {
        boolean running=true;
        int counter=0;
        String jawab;
        Scanner scan=new Scanner(System.in);
        while(running){
            System.out.println("apakah anda ingin keluar ?");
            System.out.println("jawab[ya/tidak]>");
            jawab=scan.nextLine();
            if(jawab.equalsIgnoreCase("ya")){
                running=false;
                
            }
            counter++;
        }
        System.out.println("anda sudah melakukan perulangan sebanyak "+ counter +"kali");
    }
  
}
