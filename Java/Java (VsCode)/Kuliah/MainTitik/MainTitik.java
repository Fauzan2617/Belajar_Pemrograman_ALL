package Kuliah.MainTitik;

import java.util.Scanner;

public class MainTitik {

	public static void main (String[]arg) {
		Titik T=new Titik();
		
		try (Scanner sc = new Scanner (System.in)) {
            System.out.println("x :");T.x=sc.nextInt();
            System.out.println("y :");T.y=sc.nextInt();
        }
		System.out.println("Titik :"+T.x+";"+T.y+")");
		
	}
}
