

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Bicycle b = new Bicycle();


        System.out.println("------Before speed increase-----");
        System.out.println("Car initial speed: " + c.getSpeed());
        System.out.println("Bicycle initial speed: " + b.getSpeed());

        
        System.out.println("------After speed increase-----");
        c.speedUp();
        b.speedUp();

        System.out.println("Car initial speed: " + c.getSpeed());
        System.out.println("Bicycle initial speed: " + b.getSpeed());
    }
}
