import java.util.Scanner;

public class haha {
   public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        // membaca (menginput) nilai dari sebuah jam
          System.out.print("Masukkan nilai jam: ");
          int jam = sc.nextInt();
          System.out.print("Masukkan nilai menit: ");
          int menit = sc.nextInt();
          System.out.print("Masukkan nilai detik: ");
          int detik = sc.nextInt();

          // menampilkan nilai jam yang sudah di input
          System.out.println("Jam yang dimasukkan: " + jam + ":" + menit + ":" + detik);

          // mengeluarkan ucapan otomatis berdasarkan waktu pada jam
          if (jam >= 0 && jam <= 11) {
             System.out.println("Selamat Pagi");
          } else if (jam >= 12 && jam <= 14) {
             System.out.println("Selamat Siang");
          } else if (jam >= 15 && jam <= 17) {
             System.out.println("Selamat Sore");
          } else {
             System.out.println("Selamat Malam");
          }
    }
   }
}
