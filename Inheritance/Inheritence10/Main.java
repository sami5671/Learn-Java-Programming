public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.00, "blue");
        Rectangle rectangle = new Rectangle(5.00, 5.00, "red");

        double circleArea = circle.area();
        double rectangleArea = rectangle.area();

        System.out.println("Circle area: " + circleArea);
        System.out.println("Rectangle area: " + rectangleArea);
    }
}
