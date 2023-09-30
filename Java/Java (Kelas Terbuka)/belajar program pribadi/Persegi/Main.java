package Persegi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // int lebar, panjang;
        Scanner inputuser = new Scanner(System.in);

        System.out.print("Masukkan panjang :");
        int input_panjang = inputuser.nextInt();
        System.out.print("Masukkan Lebar :");
        int input_lebar = inputuser.nextInt();

        gambar(input_panjang, input_lebar);

        System.out.println("Panjang yang ada masukkan : " + input_panjang);
        System.out.println("Panjang yang ada masukkan : " + input_lebar);
        System.out.println("Luas Persegi :" + luas(input_panjang, input_lebar));
        System.out.println("Keliling Persegi :" + keliling(input_panjang, input_lebar));

    }

    private static int luas(int panjang, int lebar) {
        int hasil = panjang * lebar;
        return hasil;
    }

    private static int keliling(int panjang, int lebar) {
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }

    private static void gambar(int panjang, int lebar) {
        int i, h;
        for (i = 0; i < lebar; i++) {
            for (h = 0; h < panjang; h++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}