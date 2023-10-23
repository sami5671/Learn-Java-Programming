// Java program to override a base class method into a derived class

public class Main {
  public static void main(String[] args) {
    Vehicle obj1 = new Vehicle();

    Vehicle obj2 = new Car();

    obj1.run();
    obj2.run();
  }
}