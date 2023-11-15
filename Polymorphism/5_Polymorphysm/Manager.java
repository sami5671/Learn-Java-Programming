

public class Manager extends Employee{
    double baseSalary;
    double bonus;

    // its a constructor


    public Manager(double baseSalary, double bonus, String name) {
            super.name();

        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.name = name;
      
    }

    public double calculateSalary(){
        return baseSalary + bonus;
    }

}
