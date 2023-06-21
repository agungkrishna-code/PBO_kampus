package contohinheritance;

public class Bird extends Animal {
    int lebarSayap;
    int panjangParuh;

    public void terbang() {
        System.out.println("Burung bisa terbang dengan sayapnya...");
    }

    @Override
    public void bersuara() {
        System.out.println("Burung bersuara cuittt..cuit...");
    }
}
