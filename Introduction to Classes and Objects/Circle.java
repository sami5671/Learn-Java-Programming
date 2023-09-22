
public class Circle {
    int center;
    double radius;

    Circle(){}

    Circle(int center, double radius){
        this.center = center;
        this.radius = radius;
    }
    double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    void setCenter(int center){
        this.center = center;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
}
