
import java.util.Scanner;;

public class Tebakan {
    public static void main(String[] args) {

        int nilai_benar = 5;
        int nilai_user;
        boolean status;

        Scanner inputuser = new Scanner(System.in);

        System.out.print("Masukkan Nilai tebakan anda :");
        nilai_user = inputuser.nextInt();
        System.out.println("Nilai Anda : " + nilai_user);

        status = (nilai_user == nilai_benar);
        System.out.println("Nilainya adalah" + status);

    }
}
