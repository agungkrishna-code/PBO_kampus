package latihaninheritance;

public class Lingkaran extends BangunDatar {
    double jari;

    public void setJari(double J) {
        jari = J;
    }

    @Override
    public double getLuas() {
        luas = Math.PI * jari * jari;
        return luas;
    }

    @Override
    public double getKeliling() {
        keliling = 2 * Math.PI * jari;
        return keliling;
    }
}
