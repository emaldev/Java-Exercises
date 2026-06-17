import java.util.Scanner;
public class SearchInArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 number for Array: ");

        for(int i = 0; i < 10; i++){
            numbers[i] = input.nextInt();
            
        }
    }
    
}
