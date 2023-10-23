// Java program to implement hierarchical inheritance
public class Main {
    public static void main(String[] args) {
        
        Derived1 obj1 = new Derived1();
        Derived2 obj2 = new Derived2();

        obj1.BaseMethod();
        obj1.Derived1Method();

        obj2.BaseMethod();
        obj2.Derived2Method();

    }
}
