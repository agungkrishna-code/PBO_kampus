package pretest;

public class Mahasiswa {
    String nim, nama;
    double ipk;

    public Mahasiswa(String pNim, String pNama, double pIPK) {
        nim = pNim;
        nama = pNama;
        ipk = pIPK;
    }

    public Mahasiswa() {
        this("-", "-", 0);
    }

    public  Mahasiswa (String pNim, String pNama) {
        this(pNim, pNama, 0);
    }

    public void displayinfo() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("IPK : " + ipk);
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("210030533", "Dewi", 3.55);
        mhs.displayinfo();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.displayinfo();
    }
}
