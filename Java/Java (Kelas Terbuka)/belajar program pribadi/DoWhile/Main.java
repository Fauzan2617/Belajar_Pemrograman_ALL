package DoWhile;

public class Main {

    public static void main(String[] args) {

        int a = 0;
        boolean kondisi = true;

        do {
            a++;
            System.out.println("Do ");

            if (a == 5) {
                kondisi = false;
            }
        } while (kondisi);

    }

}
