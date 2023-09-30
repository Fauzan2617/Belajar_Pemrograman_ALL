import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int jumlahSiswa, nilai;
            char grade;
            
            System.out.print("Masukkan jumlah siswa: ");
            jumlahSiswa = input.nextInt();
            
            for (int i = 1; i <= jumlahSiswa; i++) {
                System.out.print("Masukkan nilai siswa ke-" + i + ": ");
                nilai = input.nextInt();
                
                if (nilai >= 90) {
                    grade = 'A';
                } else if (nilai >= 80) {
                    grade = 'B';
                } else if (nilai >= 70) {
                    grade = 'C';
                } else if (nilai >= 60) {
                    grade = 'D';
                } else {
                    grade = 'E';
                }
                
                System.out.println("Grade untuk siswa ke-" + i + " adalah " + grade);
            }
        }
    }
}
