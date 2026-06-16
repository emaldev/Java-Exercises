import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :> ");
        int number = input.nextInt();
          
        
        if(number <= 100  && number >= 90){
            System.out.println("A");
        }else{
            if(number >= 90){
                System.out.println("A");
            }else if(number >= 80){
                System.out.println("B");

            }else if(number >= 70){
                System.out.println("C");

            }else if(number >= 60){
                System.out.println("D");
            }else{
                System.out.println("F");
            }
        }
      
        
        input.close();
    }
    

}
