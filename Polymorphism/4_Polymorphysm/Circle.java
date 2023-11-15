

public class Circle extends Shape {
    double radius;

    // its  a  constructor 
    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}
