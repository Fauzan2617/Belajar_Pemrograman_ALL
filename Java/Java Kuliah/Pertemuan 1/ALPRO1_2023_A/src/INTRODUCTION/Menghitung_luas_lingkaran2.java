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

public class Menghitung_luas_lingkaran2 {
    public static void main(String[] args) {

       //Inisialisasi objek input dari class scanner
       Scanner input=new Scanner(System.in);

       //Deklarasi variabel
       double totaldetik,jam=3600,menit=60,detik=1;
       int j;
       int m;
       int d;

       //Input nilai jari-jari
       System.out.print("Masukan jam : ");
       j=input.nextInt();
       System.out.print("Masukan menit : ");
       m=input.nextInt();
       System.out.print("Masukan detik : ");
       d=input.nextInt();

       //Menghitung luas lingkaran
       totaldetik=j*jam+m*menit+d*detik;

       //Tampilkan hasil
       System.out.println("totaldetik = "+totaldetik);
    } 
}
