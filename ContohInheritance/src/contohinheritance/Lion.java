package contohinheritance;

public class Lion extends Animal {
    int panjangTaring;

    public void menerkam() {
        System.out.println("Singa menerkam dengan taringnya...");
    }

    @Override
    public void bersuara() {
        System.out.println("Singa bersuara roarrrrrrrr....");
    }
}
