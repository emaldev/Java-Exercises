package Mavager;

public class Intern extends Employee{
    public double hoursWorked;
    public double hourlyRate;

    public Intern(double hoursWorked, double hourlyRate, String name, double baseSalary){
        super(name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

       @Override
       public double CalculateSalary(){
        return hourlyRate * hoursWorked;
       }

       public void displayInf(){
        System.out.println("Name:" + name + "BaseSalary: " + baseSalary + "HoursWorked: " + hoursWorked + "HourlyRate: " + hourlyRate);
       }

    
}
