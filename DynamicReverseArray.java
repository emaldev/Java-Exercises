import java.util.Scanner;

public class DynamicReverseArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] number;
        int size;
        System.out.println("Enter array size number : ");
        size = input.nextInt();
        input.nextLine();
        number = new int[size];

        for(int i = 0; i < number.length; i++){
            System.out.println("Enter a number : ");
            number[i] = input.nextInt();
        }
            System.out.println("this is my array number.");
        for(int i = number.length - 1; i >= 0; i--){
             System.out.println(number[i]);
        }
    }
}
