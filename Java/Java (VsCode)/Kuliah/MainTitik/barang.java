
import java.util.Scanner;

public class barang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah uang yang Anda miliki: ");
        int uang = scanner.nextInt();

        System.out.print("Masukkan harga barang: ");
        int hargaBarang = scanner.nextInt();

        int jumlahBarang = 0;
        while (uang >= hargaBarang) {
            jumlahBarang++;
            uang -= hargaBarang;
        }

        System.out.println("Anda dapat membeli " + jumlahBarang + " barang.");

        scanner.close();
    }
}
