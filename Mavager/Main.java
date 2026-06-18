package Mavager;

public class Main {
    public static void main(String[] args){
          
        Employee[] employees = new Employee[2];

        employees[0] = new Manager(500, "Mohammad", 20000);
        employees[1] = new Intern(2, 200, "Ali", 10000);

        for(Employee emp : employees){
            System.out.println(emp.name + "Salary: " + emp.CalculateSalary());

        }
       
        Manager myManager = new Manager(23, "milad", 2);
        Intern myIntern = new Intern(2, 300, "Asef", 340);
       
         myManager.displayInfo();
         myIntern.displayInf();
        
    }
    
}
