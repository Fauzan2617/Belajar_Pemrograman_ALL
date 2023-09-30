package Rekrusivesederhana;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner inputuser = new Scanner(System.in);

        System.out.print("Masukkan Nilai :");
        int nilai = inputuser.nextInt();
        System.out.println("Nilai yang anda masukkan :" + nilai);

        berkurang(nilai);
        System.out.println("Jumlah nya :" + jumlah(nilai));
        System.out.print("Faktorial :" + faktorial(nilai));
    }

    private static int faktorial(int parameter) {

        if (parameter == 0) {
            return parameter;
        }
        return parameter * jumlah(parameter - 1);
    }

    private static int jumlah(int parameter) {

        if (parameter == 0) {
            return parameter;
        }

        return parameter + jumlah(parameter - 1);
    }

    private static void berkurang(int parameter) {
        System.out.println("Nilai adalah :" + parameter);

        if (parameter == 0) {
            return;
        }

        parameter--;

        berkurang(parameter);
    }

}
