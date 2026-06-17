import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int[] numbers;
        int size;
        System.out.println("Enter size array number:");
        size = input.nextInt();

        numbers = new int[size];
         int count1 = 0;
         int count2 = 0; 
         int countSum = 0; 
        
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter number " + (i + 1) + " :");
            numbers[i] = input.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];

        for(int i  = 0; i < numbers.length; i++){
            if(numbers[i] > max) {
                max = numbers[i];
            
            }
            
            if(numbers[i] < min ) {
                min = numbers[i];
            }
            if(numbers[i] % 2 == 0){
                count1++;
            } else if(numbers[i] % 2 != 0){
                count2++;
            }
            
        }


        
           sum = max + min;
           countSum = count1 + count2;
           System.out.println("the max numbers : " + max );
           System.out.println("the min numbers: " + min);
           System.out.println("the max and min sum is : " + sum);
           System.out.println("this is the count even numbers : " + count1 );
           System.out.println("this is the odd count numbers : " + count2);
           System.out.println("this is the even and odd count sum : " + countSum);

           input.close();
        
    }
    

    
}
