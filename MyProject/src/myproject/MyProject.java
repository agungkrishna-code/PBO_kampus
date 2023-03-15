/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myproject;  // mendifinisikan project kita
import java.util.Scanner;

/**
 *
 * @author dewag
 */
public class MyProject { // deklarasi class

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // deklarasi method main

        Scanner sc = new Scanner(System.in); // scanner adalah nama class, sc nama object, new adalah pembuatan object baru

        System.out.print("Ketik Nama anda >> ");
        String nama = sc.nextLine();

//        String nama, telp, alamat; // deklarasi variabel
//        nama = "agung"; // menyimpan data ke variabel

        // membaca isi variabel
        System.out.println("saya " + nama + " salam kenal");
    }
    
}
