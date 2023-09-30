
import java.util.Scanner;

public class mahasiswa {
    int NRP;
    String Nama;
    float UTS, UAS, Prak, Quiz, Tgs, Hdr, NA;
    char idx;

    void BacaMhs() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("NRP: ");
            NRP = sc.nextInt();
            System.out.println("Nama: ");
            Nama = sc.next();
            System.out.println("UTS: ");
            UTS = sc.nextFloat();
            System.out.println("UAS: ");
            UAS = sc.nextFloat();
            System.out.println("Prak: ");
            Prak = sc.nextFloat();
            System.out.println("Quiz: ");
            Quiz = sc.nextFloat();
            System.out.println("Tugas: ");
            Tgs = sc.nextFloat();
            System.out.println("Kehadiran: ");
            Hdr = sc.nextFloat();
        }

    }

    void TampilMhs() {
        System.out.println("Data Mahasiswa: " + NRP + "," + Nama + "," + UTS + "," + UAS + "," + Prak + "," + Quiz + ","
                + Tgs + "," + Hdr);
    }

    double HitungNa() {
        double Nas;

        Nas = 0.2 * UTS + 0.3 + UAS + 0.;

        return Nas;
    }

    char SetIndex() {
        char Index = 'T';

        if (NA >= 85)
            Index = 'A';
        else if (NA >= 75)
            Index = 'B';
        else if (NA >= 55)
            Index = 'C';
        else if (NA >= 45)
            Index = 'D';
        else
            Index = 'E';
        return Index;
    }

    public static void main(String[] args) {
        mahasiswa T = new mahasiswa();

        T.BacaMhs();
        T.TampilMhs();

    }
}