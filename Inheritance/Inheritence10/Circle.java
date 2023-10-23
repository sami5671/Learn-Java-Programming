public class Circle extends Shape {
    double r;
    String color;

    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public void area() {
        System.out.println("Circle area: " + color + "-->" + (3.1416 * r * r));
    }
}
