package Kuliah.MainTitik;

import java.util.Scanner;

public class MainTitikTanpaRecord {
public static void main (String[] args) {
    Titik T=new Titik();
    Titik T2=new Titik();

        try (Scanner sc = new Scanner (System.in)) {
            System.out.print("x :" ); T.x=sc.nextInt();
            System.out.print("y :" ); T.y=sc.nextInt();

            System.out.println("Titik pertama: ("+T.x+","+T.y+")");

           
                System.out.print("x :" ); T2.x=sc.nextInt();
                System.out.print("y :" ); T2.y=sc.nextInt();
    
                System.out.println("Titik pertama: ("+T2.x+","+T2.y+")");
        
        }
    }
}
