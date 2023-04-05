package pertemuan4;

import java.util.Scanner;

public class latihan_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input tinggi badan dalam meter
        System.out.print("KALKULATOR BMI (BODY MASS INDEX\n");
        System.out.print("==================================================\n");
        System.out.print("TINGGI BADAN (METER) = ");
        double tinggiBadan = input.nextDouble();

        // Input berat badan dalam kg
        System.out.print("BERAT BADAN (KG) =  ");
        double beratBadan = input.nextDouble();

        // Hitung BMI
        double bmi = hitungBMI(beratBadan, tinggiBadan);

        // Tentukan kategori BMI
        String kategori = tentukanKategoriBMI(bmi);

        // Tampilkan hasil
        System.out.printf("BMI anda adalah %.1f, yang berarti anda termasuk dalam kategori %s.", bmi, kategori);
    }

    // fungsi untuk menghitung BMI
    public static double hitungBMI(double beratBadan, double tinggiBadan) {
        double bmi = beratBadan / Math.pow(tinggiBadan/100, 2);
        return bmi;
    }

    // fungsi untuk menentukan kategori berat badan
    public static String tentukanKategoriBMI(double bmi) {
        if (bmi < 18.5) {
            return "Berat Badan Kurang";
        } else if (bmi < 25) {
            return "Ideal";
        } else if (bmi < 30) {
            return "Kelebihan Berat Badan";
        } else {
            return "Obesitas";
        }
    }
}

