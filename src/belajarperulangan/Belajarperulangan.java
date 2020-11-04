/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarperulangan;
import java.util.Scanner;
/**
 *
 * @author MOKLET1
 */
public class Belajarperulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi variabel
        ;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka = ");
        int angka=input.nextInt();
        
        
     for (int a = 0; a <= angka; a++) {
            for (int b =0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
                
            
        }   
    }
    }

