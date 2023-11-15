// super class 
public class Employee {
    String name;
    String role; 

    public Employee(String name, String role){
        this.name = name;
        this.role = role;
    }

    public String getName(){
        return name;
    }

    public String getRole(){
        return role;
    }

    public double calculateSalary(){
        return 0;
    }
}
