import java.util.Scanner;


public class BasicCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 number : > ");
           int num1  = input.nextInt();
           int num2 = input.nextInt();
          
           int sum = num1 + num2;
           int Subtraction = num1 - num2;
           int Muliplication = num1 * num2; 
      


           System.out.println("Sum : " + sum );
           System.out.println("Subtraction: " + Subtraction);
           System.out.println("Multiplication: " + Muliplication);
           if(num2 != 0){
        double Division = (double) num1 / num2;
        System.out.println("Division: " + Division);

    }else{
        System.out.println("Division : Error (Cannot divide by zero ");
    }  
    input.close();
    }

  
    
}