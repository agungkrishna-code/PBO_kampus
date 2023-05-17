package latihan1;

public class Car {
    String nim, colour;
    double fuel, distance, speed;

    public void gas() {
        distance += speed;
        fuel -= speed / 10;
        System.out.println("brummm..brumm...mobil bergerak maju");
    }
    public void brake() {
        distance -= 5;
        fuel -= 5.0 / 10.0;
        System.out.println("brummm..brumm...mobil bergerak mundur");
    }
    public  void viewStatus() {
        System.out.println("===============================================");
        System.out.println("jarak nyang ditempuh : " + distance);
        System.out.println();
    }
}
