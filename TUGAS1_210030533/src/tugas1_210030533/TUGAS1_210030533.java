/*
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*%
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%(
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@%%%.
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@**,@@%%%%(
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@***@@@%%%%%
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@****@@@%%%%%%
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*****@@@%%%%%%%
@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@@******@@@%%%%%%%*
@@@@@@@@@@@@@@@@@@@@@@@@@@%##@@******,@@@%%%%%%%%
@@@@@@@@@@@@@@@@@@@@@@@@@@####@@*******@@@%%%%%%%%%
@@@@@@@@@@@@@@@@@@@@@@@@@#####(@@*******@@@*%%%%%%%%%
@@@@@@@@@@@@@@@@@@@@@@@@@######%@@.*******@@@%%%%%%%%%
@@@@@@@@@@@@@@@@@@@@@@@@@@#######@@@*******%@@@%%%%%%%%%
@@@@@@@@@@@@@@@@@@@@@@@%@@@########@@&*******@@@%%%%%%%%%
@@@@@@@@@@@@@@@@@@@@@@@%%%@@@@#######@@/******@@@%%%%%%%%%
@@@@@@@@@@@@@@@@@@@@@@@%%%%%%#@@@@@@###@@******@@@%%%%%%%%
@@@@@@@@@@@@@@@@@@@@@@@@%%%%%%%%%%%#@@@*@@.****@@@%%%%%%%%
@@@@@@@@@@@@@@@@@@@@@@#%%%%%%%%%%%%%%%%@@@@.***@@@%%%%%%%%
@@@@@@@@@@@@@@@@@@@@@@@&@/%%%%%%%%%%%%%%%@@@**@@@(%%%%%%%
@@@@@@@@@@@@@@@@@@@@@@@@@%%%%%%%%%%%%%%%%(@@*@@@%%%%%%%%
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%%%%%%%%%%@@*%%%%%%%%%
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%(@#%%%%%%%%%%%%%%%%%%&*%
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,%%@@.%%%%%%%%(@%%%
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@@/%
NAMA  : DEWA GEDE AGUNG KRISHNANANDA SUDEWA
NIM   : 210030533
KELAS : BA213
*/

package tugas1_210030533;

import java.util.Scanner;

public class TUGAS1_210030533 {

    public static void main(String[] args) {
        String jenjang, fakultas;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        // Mendapatkan tahun angkatan dari NIM
        int tahun = 2000 + Integer.parseInt(nim.substring(0, 2));

        // Mendapatkan kode prodi dari NIM
        int kodeProdi = Integer.parseInt(nim.substring(2, 5));
        String prodi = switch (kodeProdi) {
            case 1 -> "Sistem Komputer";
            case 2 -> "Manajemen Informatika";
            case 3 -> "Sistem Informasi";
            case 4 -> "Teknologi Informasi";
            case 5 -> "Bisnis Digital";
            case 201 -> "Magister Sistem Informasi";
            default -> "Program Studi Tidak Diketahui";
        };

        // Mendapatkan jenjang dan fakultas berdasarkan kode prodi
        if (kodeProdi == 2 ) {
            jenjang = "D3";
            fakultas = "Bisnis dan Vokasi";
        } else if (kodeProdi == 5) {
            jenjang = "S1";
            fakultas = "Bisnis Dan Vokasi";
        } else if (kodeProdi == 1 || kodeProdi == 3 || kodeProdi == 4) {
            jenjang = "S1";
            fakultas = "Informatika dan Komputer";
        } else if (kodeProdi == 201) {
            jenjang = "S2";
            fakultas = "Informatika Dan Komputer";
        } else {
            jenjang = "Jenjang Tidak Diketahui";
            fakultas = "Fakultas Tidak Diketahui";
        }

        // Menampilkan informasi hasil dari NIM mahasiswa
        System.out.println("=================================================");
        System.out.println("Angkatan: " + tahun);
        System.out.println("Prodi: " + prodi);
        System.out.println("Jenjang: " + jenjang);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("=================================================");
    }
}