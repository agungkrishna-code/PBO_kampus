package pertemuan4;

import java.util.Scanner;

public class latihan_2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double tugas, kuis, uts, uas, nakhir;
        String nhuruf;

//      baca input
        System.out.print("input nilai tugas : ");
        tugas = sc.nextDouble();
        System.out.print("input nilai kuis : ");
        kuis = sc.nextDouble();
        System.out.print("input nilai uts : ");
        uts = sc.nextDouble();
        System.out.print("input nilai uas : ");
        uas = sc.nextDouble();

//      hitung niai
        nakhir = (0.2 * tugas) + (0.2 * kuis) + (0.2 * uts) + (0.2 * uas);

        if (nakhir >= 85 && nakhir <= 100){
            nhuruf = "A";
        }
        else if (nakhir >= 65 && nakhir <= 85) {
            nhuruf = "B";
        }
        else if (nakhir >= 55 && nakhir <= 65) {
            nhuruf = "C";
        }
        else if (nakhir >= 45 && nakhir <= 55) {
            nhuruf = "D";
        }
        else if (nakhir >= 0 && nakhir <= 45) {
            nhuruf = "E";
        }
        else {
            nhuruf = "Tolol";
        }

//      TAMPILAN OUTPUT
        System.out.println("Nilai Akhir = " + nakhir);
        System.out.println("Nilai Huruf = " + nhuruf);
    }
}
