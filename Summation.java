import java.util.Scanner;

public class Summation {
    public static void main(String[] args){

        Scanner input = new  Scanner(System.in);

        int[] numbers;
        int size;
        int sum = 0; 
        System.out.println("Enter array size:");
        size = input.nextInt();
        input.nextLine();
        numbers = new int[size];
              for(int i = 0; i < numbers.length; i++){
                System.out.println("number " + (i + 1) + " ");
                numbers[i] = input.nextInt();
              }    

              for(int i = 0 ; i < numbers.length; i++){
                if(numbers[i] % 2 == 0){
                    sum += numbers[i];
                    
                }
              }
              System.out.println("this is my sum numbers:> " + sum);
                           
              input.close();
    
    }
    
}
