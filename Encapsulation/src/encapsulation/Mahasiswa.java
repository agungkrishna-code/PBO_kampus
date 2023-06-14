package encapsulation;

public class Mahasiswa {
    private String nim, nama;
    private double ipk;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Mahasiswa(String pNim, String pNama, double pIPK) {
        nim = pNim;
        nama = pNama;
        ipk = pIPK;
    }

    public Mahasiswa() {
        this("-", "-", 0);
    }

    public Mahasiswa(String pNim, String pNama) {
        this(pNim, pNama, 0);
    }

    public void displayinfo() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("IPK : " + ipk);
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("210030533", "Dewi", 3.55);

        mhs.setNama("Dewi Persik");

        System.out.println("Nama = " + mhs.getNama());
        System.out.println("NIM = " + mhs.getNim());

        mhs.displayinfo();
    }
}