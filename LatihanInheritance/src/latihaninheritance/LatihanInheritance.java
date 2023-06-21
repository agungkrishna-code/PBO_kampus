package latihaninheritance;

public class LatihanInheritance {

    public static void main(String[] args) {
        SegiEmpat s4 = new SegiEmpat();
        s4.setPanjang(10);
        s4.setLebar(5);
        System.out.println("Luas Segiempat        = " + s4.getLuas());
        System.out.println("Keliling Segiempat    = " + s4.getKeliling());
        System.out.println("=================================");
        Segitiga s3 = new Segitiga();
        s3.setAlas(5);
        s3.setSisi(5, 5, 5);
        s3.setTinggi(5);
        System.out.println("Luas Segitiga        = " + s3.getLuas());
        System.out.println("Keliling Segitiga    = " + s3.getKeliling());
        System.out.println("=================================");
        Lingkaran s2 = new Lingkaran();
        s2.setJari(10);
        System.out.println("Luas Lingkaran        = " + s2.getLuas());
        System.out.println("Keliling Lingkaran    = " + s2.getKeliling());
    }
}
