import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // KAMUS
            int jam = inputJam(sc);
            int menit = inputMenit(sc);
            int detik = inputDetik(sc);

            tampilkanJam(jam, menit, detik);
            tampilkanUcapan(jam);
        }
    }

    // ALGORITMA
    public static int inputJam(Scanner sc) {
        int jam;
        do {
            System.out.println("Masukkan Nilai jam :");
            jam = sc.nextInt();
        } while (jam < 0 || jam > 23);
        return jam;
    }

    public static int inputMenit(Scanner sc) {
        int menit;
        do {
            System.out.println("Masukkan Nilai menit :");
            menit = sc.nextInt();
        } while (menit < 0 || menit > 60);
        return menit;
    }

    public static int inputDetik(Scanner sc) {
        int detik;
        do {
            System.out.println("Masukkan Nilai detik :");
            detik = sc.nextInt();
        } while (detik < 0 || detik > 60);
        return detik;
    }

    public static void tampilkanJam(int jam, int menit, int detik) {
        System.out.println("jam yang dimasukkan :" + jam + ":" + menit + ":" + detik);
    }

    public static void tampilkanUcapan(int jam) {
        if (jam >= 0 && jam <= 11) {
            System.out.println("Selamat pagi");
        } else if (jam >= 12 && jam <= 14) {
            System.out.println("Selamat Siang");
        } else if (jam >= 15 && jam <= 18) {
            System.out.println("Selamat Sore");
        } else if (jam >= 19 && jam <= 23 || jam == 0) {
            System.out.println("Selamat Malam");
        } else {
            System.out.println("Nilai yang anda masukkan salah !");
        }
    }
}
