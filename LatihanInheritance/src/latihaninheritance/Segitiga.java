package latihaninheritance;

public class Segitiga extends BangunDatar {
    private double alas, tinggi, sisiA, sisiB, sisiC;

    public void setAlas(double A) {
        alas = A;
    }

    public void setTinggi(double T) {
        tinggi = T;
    }

    public void setSisi(double sisiA, double sisiB, double sisiC) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    @Override
    public double getLuas() {
        luas = (alas * tinggi) / 2;
        return luas;
    }

    @Override
    public double getKeliling() {
        keliling = sisiA + sisiB + sisiC;
        return keliling;
    }
}
