
public class Main {
    public static void main(String[] args) {

        double r = 2.0;
        Circle circle = new Circle(r);
        
		double a = 3.0, b = 4.0, c = 5.0;
        Triangle t = new Triangle(a,b,c);
     
        System.out.println("Area of the Circle: " + circle.CalculateArea());
        System.out.println("Perimeter of the Circle: " + circle.CalculatePerimeter());

        System.out.println("Area of the Triangle: " + t.CalculateArea());
        System.out.println("Perimeter of the Triangle: " + t.CalculatePerimeter());
    }
}
;