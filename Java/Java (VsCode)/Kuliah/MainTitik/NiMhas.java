package Kuliah.MainTitik;

import java.util.Scanner;


public class NiMhas {
    int NRP;
    String Nama;
    String KodeMk;
    char Nilai;

    public static void name(String[] args) {
        NiMhas T=new NiMhas();

        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("NRP :");T.NRP=sc.nextInt();
            System.out.println("Nama:");T.Nama=sc.next();
            System.out.println("Kode mata kuliah :");T.KodeMk=sc.next();
            System.out.println("Index nilai :");T.Nilai= sc.next().charAt(0);
            System.out.println("NiMhas : ("+T.NRP+","+T.Nama+","+T.KodeMk+","+T.Nilai+")");
        }
    }

    public void inputData() {
    }

    public void displayNiMhas() {
    }

    public void calculateGrade() {
    }

    
}
