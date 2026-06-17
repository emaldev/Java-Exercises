import java.util.Scanner;

public class FilterOddNumber {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
                   System.out.println("Hi my name is Emal Hasanzada I want to a FullStak deveoloper.");
        int[] numbers;
        int size;
        System.out.println("Enter array size number :");
        size = input.nextInt();
        input.nextLine();

        numbers = new int[size];

        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter number " + (i + 1 ) + ": ");
              numbers[i] = input.nextInt();
        }
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 != 0 ){
                System.out.println("this is Odd number array :>" + numbers[i]);
            }
        }
        input.close();


    }
    
}
