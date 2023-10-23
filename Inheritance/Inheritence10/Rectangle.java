public class Rectangle extends Shape {
    public Rectangle(double h, double w, String color) {
        this.h = h;
        this.w = w;
        this.color = color;
    }

    @Override
    public void area() {
        System.out.println("Circle area: " + color + "-->" + (h * w));

    }
}
