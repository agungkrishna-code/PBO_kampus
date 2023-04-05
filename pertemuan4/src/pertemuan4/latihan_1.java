package pertemuan4;

import java.util.Scanner;

public class latihan_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input angka >> ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " Bilangan Genap");
        }
        else {
            System.out.println(angka + " Bilangan Ganjil");
        }
//        pakai ternary
//        System.out.println(angka + " Bilangan " + (angka%2==0 ? "Genap":"Ganjil"));
    }
}
