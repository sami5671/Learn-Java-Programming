
public class Triangle extends Shape{
    
    double a,b,c;

    // using constructor
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double CalculateArea(){
        double s = ((a + b + c)/2);
        return Math.sqrt(s * (s - a) * (s -b ) * (s - c)); 
    }
    double CalculatePerimeter(){
        return a+b+c;
    }
}
