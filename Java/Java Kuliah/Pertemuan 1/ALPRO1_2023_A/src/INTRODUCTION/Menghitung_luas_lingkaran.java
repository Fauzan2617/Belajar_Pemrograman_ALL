/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package INTRODUCTION;


/**
 *
 * @author sarah
 *

    /**
     * @param args the command line arguments
     */
   import java.util.Scanner;

public class Menghitung_luas_lingkaran {
    public static void main(String[] args) {

       //Inisialisasi objek input dari class scanner
       Scanner input=new Scanner(System.in);

       //Deklarasi variabel
       double luas, phi=3.14;
       int r;

       //Input nilai jari-jari
       System.out.print("Masukan Jari-jari : ");
       r=input.nextInt();

       //Menghitung luas lingkaran
       luas=phi*r*r;

       //Tampilkan hasil
       System.out.println("Luas Lingkaran = "+luas);
    } 
}
