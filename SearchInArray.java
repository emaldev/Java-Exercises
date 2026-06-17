import java.util.Scanner;
public class SearchInArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
          System.out.println("Enter 10 number for Array: ");
        int[] numbers = new int[10];
           
          
        boolean isFound = false;
      
        for(int i = 0; i <numbers.length; i++){
            numbers[i] = input.nextInt();

         
            }
    
            System.out.println("Enter target number: ");
           int target = input.nextInt();
           for(int i = 0; i < numbers.length; i++){
                 if(target == numbers[i]){
                System.out.println("This is the target number " + i);
                isFound  = true;
                break;
                }
           }
          
           if(!isFound){
            System.out.println("Error: the number is nor Found.");
           }
            
            

        
    }
    
}
