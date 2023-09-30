import java.util.Scanner;

public class tugas3{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int jumlahSiswa, nilai;
            char grade;
            
            System.out.print("Masukkan jumlah siswa: ");
            jumlahSiswa = input.nextInt();
            
            for (int i = 1; i <= jumlahSiswa; i++) {
                System.out.print("Masukkan nilai siswa ke-" + i + ": ");
                nilai = input.nextInt();
                
                if (nilai >= 85) {
                    grade = 'A';
                } else if (nilai <= 85 && nilai > 70) {
                    grade = 'B';
                } else if (nilai <= 70 && nilai > 50) {
                    grade = 'C';
                } else if (nilai <= 50 && nilai > 40) {
                    grade = 'D';
                } else  if (nilai < 40){
                    grade = 'E';
                }else {
                    grade = 'E';
                }
                
                System.out.println("Grade untuk siswa ke-" + i + " adalah " + grade);
            }
        }
    }
}
