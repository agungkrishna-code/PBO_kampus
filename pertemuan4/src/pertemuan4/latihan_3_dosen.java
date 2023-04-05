package pertemuan4;

import java.util.Scanner;
public class latihan_3_dosen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tinggi, berat, bmi;
        String kategori;

//      BACA INPUT
        System.out.println("APP KALKULATOR BERAT BEDAN");
        System.out.println("===================================");
        System.out.print("Input Tinggi (m) >> ");
        tinggi = sc.nextDouble();
        System.out.print("Input Berat (kg) >> ");
        berat = sc.nextDouble();

//      PROSES HITUNG
        bmi = berat / (tinggi * tinggi);
        if (bmi < 18.5) {
            kategori = "Berat Badan Kurang";
        }
        else if (bmi >= 18.5 && bmi < 25) {
            kategori = "Ideal";
        }
        else if (bmi >= 25 && bmi < 30) {
            kategori = "Kelebihan Berat Anda";
        }
        else if (bmi >= 30) {
            kategori = "Obesitas";
        }
        else {
            kategori = "Invalis";
        }

//      TAMPILAN OUTPUT
        System.out.println("BMI anda : " + bmi);
        System.out.println(kategori);
   }
}
