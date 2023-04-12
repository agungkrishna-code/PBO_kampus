package pertemuan6;

public class break_contoh {

    public static void main(String[] args) {
        for (int x = 1; x <= 5; x++ ) {
            System.out.println("Statement Pertama Iterasi " + x);
            System.out.println("Statement Kedua   Iterasi " + x);

            if (x == 3)
                break;

            System.out.println("Statement Ketiga   Iterasi " + x);
            System.out.println("Statement Keempat  Iterasi " + x);
        }
    }
}
