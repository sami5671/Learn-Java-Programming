
public class Circle extends Shape {
    double radius;

    // constructor parameters
    public Circle(double radius){
       this.radius = radius;
    }

    double CalculateArea(){
        return Math.PI * radius *radius;
    }
    double CalculatePerimeter(){
        return 2 * Math.PI * radius;
    }

}
