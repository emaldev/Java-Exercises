import java.util.Scanner;

public class FilterArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] number;
        int size;
        System.out.println("Enter size array :");
        size = input.nextInt();
        input.nextLine();

        number = new int[size];
        for(int i = 0; i < number.length; i++){
            System.out.println("Enter number array :");

            number[i] = input.nextInt();
        }

        for(int i = 0; i < number.length; i++){
            if(number[i] % 2 == 0 ){
                System.out.println("This is the even number " + number[i]);
            }
        }
        input.close();
    }
    
}
