import java.util.Scanner;

public class StringReverser {
    
public class StringRevers{
    public static String reverseString( String input){
        String reversed = "";
        for(int i = input.length() -1; i >= 0; i--){
            reversed += input.charAt(i);
        }
        return reversed;

    }
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a String to reverse:");
      String text = input.nextLine();

      String result = reverseString(text);
      System.out.println("Reversed string: " + result);

      input.close();

    
}

}
    

}
