package latihan3;
import java.util.Scanner;

public class Latihan3 {

    public static void main (String [] args) {
//      deklarasi variabel
        int pilihMenu = 0;
        Scanner baca = new Scanner(System.in);

//      menampilkan teks pilihan menu
        System.out.println("PROGRAM HITUNG LUAS BANGUN DATAR");
        System.out.println("=====================================");
        System.out.println("1. Segitiga");
        System.out.println("2. Segi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Exit");

        while (pilihMenu != 4) {
//          baca input user
            System.out.print("\nPilih Menu : ");
            pilihMenu = baca.nextInt();

            if (pilihMenu == 1) {
                System.out.print("Masukan Alas        : ");
                double A = baca.nextDouble();
                System.out.print("Masukan Tinggi      : ");
                double T = baca.nextDouble();
                double luas = 0.5 * A * T;
                System.out.println("Luas Segitiga = " + luas);
            }
            else if (pilihMenu == 2) {
                System.out.print("Masukan Panjang      : ");
                double P = baca.nextDouble();
                System.out.print("Masukan Lebar        : ");
                double L = baca.nextDouble();
                double luas = P * L;
                System.out.println("Luas Segi Panjang = " + luas);
            }
            else if (pilihMenu == 3) {
                System.out.print("Masukan Jari-Jari     : ");
                double R = baca.nextDouble();
                double luas = 3.14 * R * R;
                System.out.println("Luas Lingkaran = " + luas);
            }
            else if (pilihMenu == 4) {
                System.out.println("Terimakasih");
            }
        }
    }
}
