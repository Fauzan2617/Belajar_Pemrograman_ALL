package ForLoop;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int loop_akhir, loop_awal;
        int total = 0;

        System.out.print("Loop Sederhana menggunakan For Loop");
        Scanner inputuser = new Scanner(System.in);
        System.out.print("Masukkan Angka Loop Awal ");
        loop_awal = inputuser.nextInt();
        System.out.print("Masukkan Angka Loop akhir ");
        loop_akhir = inputuser.nextInt();

        for (; loop_awal < loop_akhir; loop_awal++) {
            total = loop_awal + total;
            System.out.println("Penjumlahan dengan +\t" + loop_awal + "menjadi\t" + total);
        }
        System.out.println("Akhir Program");
    }

}

