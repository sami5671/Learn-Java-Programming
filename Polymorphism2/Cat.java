// method override is the same method name in different classes in different actions
public class Cat extends Animal {
    private String littlePreference;

    @Override
    public void eat(){
        System.out.println("meow!");
    }
    public String getLittlePreference(){
        return littlePreference;
    }
    public void setLittlePreference(String littlePreference){
        this.littlePreference = littlePreference;
    }
}
