import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input;

        Scanner inputuser = new Scanner(System.in);

        System.out.print("Absen sekarang !!");
        input = inputuser.nextLine();

        switch (input) {
            case "dwi":
                System.out.println("Hadir");
                break;
            case "fauzan":
                System.out.println("Hadir");
                break;
            case "putera":
                System.out.println("Hadir");
                break;
            default:
                System.out.println(input + " tidak hadir Bos!!!");
        }

    }

}
