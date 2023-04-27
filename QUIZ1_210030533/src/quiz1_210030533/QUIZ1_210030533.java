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

package quiz1_210030533;
import java.util.Scanner;

public class QUIZ1_210030533 {

    public static double cmToInch(double cm) {
        return cm / 2.54;
    }

    public static double cmToFeet(double cm) {
        return cm / 30.48;
    }

    public static double inchToCm(double inch) {
        return inch * 2.54;
    }

    public static double inchToFeet(double inch) {
        return inch / 12;
    }

    public static double feetToCm(double feet) {
        return feet * 30.48;
    }

    public static double feetToInch(double feet) {
        return feet * 12;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("PROGRAM KONVERSI PANJANG");
        System.out.println("========================");
        System.out.println("(1:Centimeter, 2:Inch, 3:Feet)");

        System.out.print("Pilih menu >> ");
        int option = input.nextInt();

        double nilai;
        switch (option) {
            case 1 -> {
                System.out.print("Input Nilai Centimeter >> ");
                nilai = input.nextDouble();
                System.out.println("Inch = " + cmToInch(nilai));
                System.out.println("Feet = " + cmToFeet(nilai));
            }
            case 2 -> {
                System.out.print("Input Nilai Inch >> ");
                nilai = input.nextDouble();
                System.out.println("Centimeter = " + inchToCm(nilai));
                System.out.println("Feet = " + inchToFeet(nilai));
            }
            case 3 -> {
                System.out.print("Input Nilai Feet >> ");
                nilai = input.nextDouble();
                System.out.println("Centimeter = " + feetToCm(nilai));
                System.out.println("Inch = " + feetToInch(nilai));
            }

            default -> System.out.println("Pilihan Tidak Valid.");
        }
    }
}
