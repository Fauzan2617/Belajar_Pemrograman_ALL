import java.util.Scanner;

public class tugas2{
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int jumlahSiswa, nilai, i = 1;
            char grade;
            
            System.out.print("Masukkan jumlah siswa: ");
            jumlahSiswa = input.nextInt();
            
            while (i <= jumlahSiswa) {
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
                
                i++;
            }
        }
    }
}
