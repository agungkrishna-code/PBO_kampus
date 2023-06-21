package latihaninheritance;

public class SegiEmpat extends BangunDatar {
    private double panjang, lebar;

    public void setPanjang(double P) {
        panjang = P;
    }
    public void  setLebar(double L) {
        lebar = L;
    }

    @Override
    public double getLuas() {
        luas = panjang * lebar;
        return luas;
    }
    @Override
    public double getKeliling() {
        keliling = 2 * (panjang + lebar);
        return keliling;
    }
}
