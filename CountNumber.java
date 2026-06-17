import java.util.Scanner;
public class CountNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] number;
        int size;
        int count = 0; 
        System.out.println("Enter size array:");
        size = input.nextInt();
        number = new int[size];
              for(int i = 0; i < number.length; i++){
                System.out.println("Enter number "+ (i + 1) + " :" );
                number[i] = input.nextInt();
              }

              for(int i = 0; i < number.length; i++){
                if(number[i] % 2 == 0){
                    count++;
                    System.out.println(number[i]);
                   
                }
              }
               System.out.println("this is my cont: " + count);
              input.close();
        
    }
    
}
