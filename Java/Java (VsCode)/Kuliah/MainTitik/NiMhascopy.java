package Kuliah.MainTitik;

import java.util.Scanner;

public class NiMhascopy {
    int NRP;
    String Nama;
    String KodeMk;
    char Nilai;

    public static void main(String[] args) {
        NiMhascopy T = new NiMhascopy();
        T.inputData();
        T.displayNiMhas();
        T.calculateGrade();
    }

    public void inputData() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("NRP: ");
            NRP = sc.nextInt();
            System.out.println("Nama: ");
            Nama = sc.next();
            System.out.println("Kode mata kuliah: ");
            KodeMk = sc.next();
            System.out.println("Index nilai: ");
            Nilai = sc.next().charAt(0);
        }
    }

    public void displayNiMhas() {
        System.out.println("NiMhascopy: (" + NRP + ", " + Nama + ", " + KodeMk + ", " + Nilai + ")");
    }

    public void calculateGrade() {
        String grade;
        switch (Nilai) {
            case 'A':
                grade = "Excellent";
                break;
            case 'B':
                grade = "Good";
                break;
            case 'C':
                grade = "Average";
                break;
            case 'D':
                grade = "Below Average";
                break;
            case 'E':
                grade = "Fail";
                break;
            default:
                grade = "Invalid Grade";
                break;
        }
        System.out.println("Grade: " + grade);
    }
}
