/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myproject;
import java.util.Scanner;

/**
 *
 * @author dewag
 */
public class tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alas, tinggi;
        double luas;

        System.out.print("input alas: ");
        alas = input.nextInt();

        System.out.print("input tinggi: ");
        tinggi = input.nextInt();

        luas = (alas * tinggi) / 2.0;

        System.out.println("input alas : " + alas);
        System.out.println("input tinggi : " + tinggi);
        System.out.println("===================================");
        System.out.println("Luas segitiga : " + luas);
    }

}
