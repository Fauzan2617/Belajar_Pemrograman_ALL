
public class Main {

    public static void main(String[] args) {

        boolean kondisi = true;
        int a = 0;

        while (kondisi) {
            System.out.println("White Loop ke berapa : " + a);

            if (a >= 10) {
                break;
            }
            a++;
        }
        System.out.println("Program Selesai");
    }
}
