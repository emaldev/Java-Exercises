import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);



        String[] foods;
        int size;
        System.out.println("What a numb food do you want? :");
        size = input.nextInt();
        input.nextLine();

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.println("Enter a food :");
            foods[i] = input.nextLine();
        }
       
        
          for(String food : foods){ 
            System.out.println(food);
          }
    }
}
