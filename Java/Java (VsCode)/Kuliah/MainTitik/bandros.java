import java.util.Scanner;

public class bandros {

    static public void main(String[] args) {
        // variable
        int sisauang;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah uang :");
            int jumlahuang = scanner.nextInt();

            System.out.print("Masukkan harga bandros :");
            int hargabandros = scanner.nextInt();

            int jumlahbeli = 0;
            while (jumlahbeli < 3 && jumlahuang > hargabandros) {
                if (jumlahbeli > 1) {
                    int diskon = (int) 0.1;
                    hargabandros = hargabandros * diskon;
                }
                jumlahuang = jumlahuang - hargabandros;
                jumlahbeli++;

            }
            sisauang = jumlahuang;
            System.out.println(jumlahbeli);
            System.out.println("sisa uang anda :" + sisauang);
            scanner.close();
        }

    }
}