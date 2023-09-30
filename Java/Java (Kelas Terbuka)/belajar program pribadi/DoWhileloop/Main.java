package DoWhileloop;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int loop_awal, loop_akhir;
        int total = 0;

        Scanner inputuser = new Scanner(System.in);
        System.out.print("masukkan loop awal : ");
        loop_awal = inputuser.nextInt();
        System.out.print("masukkan loop akhir : ");
        loop_akhir = inputuser.nextInt();

        do {
            total = total + loop_awal;
            System.out.println("Penjumlahan dengan +\t" + loop_awal + "menjadi\t" + total);
            loop_awal++;
        } while (loop_awal < loop_akhir);

    }

}
