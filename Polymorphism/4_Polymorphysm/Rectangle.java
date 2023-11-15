
public class Rectangle extends Shape {
    double width, height;

    // its a constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double calculateArea(){
        return width * height;
    }
}
