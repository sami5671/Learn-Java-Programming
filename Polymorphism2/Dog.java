// when in any class have two same method but actually have different parameters that is called method overloading
public class Dog extends Animal {
    private int breed;

//   @overloading
    public void eat(){
        System.out.println("Chomp chomp");
    }
    public void eat(int numberOfTimes){
        for(int i=0; i<numberOfTimes; i++){
        System.out.println("Chomp chomp");
        }
    }

    public int getBreed(){
        return breed;
    }
    public void setBreed(int breed) {
        this.breed = breed;
    }
    
}
