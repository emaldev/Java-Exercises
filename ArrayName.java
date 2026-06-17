import java.util.Scanner;

public class ArrayName {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] names = new String[6];
          System.out.println("Enter 6 names: ");
        for(int i = 0; i < 6; i++){
            names[i] = input.nextLine();

           
        }
        System.out.println("====================================================");
          for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
          }
    }
    
}
