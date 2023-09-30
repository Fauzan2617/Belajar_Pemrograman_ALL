package MainTitik;

public class latihan1 {

    public static void main(String[] args) {
        int hargaBandros = 7;
        int jumlahUang = 51;
        int jumlahPembelian = 0;
        double diskon = 0.1;

        while (jumlahPembelian < 3 && jumlahUang >= hargaBandros) {
            jumlahPembelian++;
            jumlahUang -= hargaBandros;

            if (jumlahPembelian > 1) {
                double potonganDiskon = hargaBandros * diskon;
                jumlahUang += potonganDiskon;
            }
        }

        System.out.println("Jumlah bandros yang dibeli oleh Ali: " + jumlahPembelian);
        System.out.println("Sisa uang Ali: " + jumlahUang);
    }
}