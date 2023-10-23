

public class Polymorphism {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog b = new Dog();
        Cat c = new Cat();

        a.eat();

        // method overloading 
        b.eat(4);
        c.eat();


    }
}
