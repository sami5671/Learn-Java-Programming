
public class Main {
    public static void main(String[] args) {
       Circle c = new Circle(4);
       Rectangle r = new Rectangle(2,2);
       Triangle t = new Triangle(2,4);

       System.out.println("area of circle: "+ c.calculateArea());
       System.out.println("Area of rectangle: "+ r.calculateArea());
       System.out.println("Area of Triangle: "+ t.calculateArea());
    }
}
