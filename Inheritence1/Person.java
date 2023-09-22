public class Person {
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getGreeting(){
        return "Hi, I'm " + firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    // add setters and getters here
}
