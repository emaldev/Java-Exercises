package Mavager;

public class Manager extends Employee {
        public int bouns;
    public Manager(int bouns, String name, double baseSalary){
        super(name, baseSalary);
        this.bouns = bouns;
    }

    @Override
    public double  CalculateSalary(){
        return bouns + baseSalary;
    }

    public void displayInfo(){
        System.out.println("Name: " + name + "BaseSalary: " + baseSalary + "bouns: " + bouns);
    }

    
}
