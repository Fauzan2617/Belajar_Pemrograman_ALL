package Kalkulatorsederhana;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a, b, hasil;
        char operator;

        Scanner inputanuser = new Scanner(System.in);

        System.out.print("Masukkan Angka pertama :");
        a = inputanuser.nextInt();
        System.out.print("Masukkan Operator :");
        operator = inputanuser.next().charAt(0);
        System.out.print("Masukkan Angka kedua :");
        b = inputanuser.nextInt();

        if (operator == '+') {
            hasil = a + b;
            System.out.println("Hasil pertambahan adalah :" + hasil);
        } else if (operator == '-') {
            hasil = a - b;
            System.out.println("Hasil perkurangan adalah :" + hasil);
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("Hasil perkalian adalah :" + hasil);

        } else if (operator == '/') {
            hasil = a / b;
            System.out.println("Hasil pembagian adalah :" + hasil);
        } else {
            System.out.println("Ada Kesalahan !!!");
        }

    }
}