import java.util.Scanner;

 public class tugas4Copy{
    /**
     * 
     */
    public static void main(String[] args){
        try (Scanner sc= new Scanner(System.in)){
            int jam, menit, detik;
            // Input nilai dari jam
            do {
            System.out.println("Masukkan Nilai jam :");
             jam = sc.nextInt();
            } while (jam < 0 || jam > 23);

            do {
            System.out.println("Masukkan Nilai menit :");
             menit = sc.nextInt();
            } while (menit < 0 || menit > 60);

            do {
            System.out.println("Masukkan Nilai detik :");
             detik = sc.nextInt();
            } while (detik < 0 || detik > 60);

            // Nampilkan Jam, menit dan detik yang sudah di input
            System.out.println("jam yang dimasukkan :" + jam + ":" + menit + ":" + detik );

            // Prosedur untuk menampilkan pagi siang dan sore
            if (jam >= 0 && jam <= 11){
                System.out.println("Selamat pagi");
            } else if (jam >= 12 && jam <= 14){
                System.out.println("Selamat Siang");
            } else if (jam >= 15 && jam <= 6){
                System.out.println("Selamat Sore");
            } else if (jam >= 7 && jam <= 0){
                System.out.println("Selamat Malam");
            } else {
                System.out.println("Nilai yang anda masukkan salah !");
            }
        }
        
    }

 }