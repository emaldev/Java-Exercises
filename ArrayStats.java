import java.util.Scanner;
public class ArrayStats {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
       System.out.println("Enter 5 numbers:");
         
       numbers[0] = input.nextInt();
       int max = numbers[0];
       int min = numbers[0]; 
       int sum = numbers[0];

       for(int i = 1; i < 5; i++){
        numbers[i] = input.nextInt();

        if(numbers[i] > max) max = numbers[i];
        if(numbers[i] < min) min = numbers[i];
        
        sum += numbers[i];
       }

       System.out.println("Max: " + max);
       System.out.println("Min: " + min);
       System.out.println("Sum: " + sum);

       input.close();
    
}
}
