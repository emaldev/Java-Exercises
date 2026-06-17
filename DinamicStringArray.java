import java.util.Scanner;
public class DinamicStringArray {
    public static void main(String[] args){
          
        Scanner input = new Scanner(System.in);

          String[] names;
          int size;
          System.out.println("Enter a number for size array: ");
          size = input.nextInt();
          input.nextLine();

          names = new String[size];

          for(int i = 0; i < names.length; i++){
            System.out.println("Enter a name for array:");
            names[i] = input.nextLine();
          } 
          System.out.println("this is reverse names :");
          for(int i = names.length -1 ; i >= 0; i--){
            System.out.println(names[i]);
          }
    }
    
}
