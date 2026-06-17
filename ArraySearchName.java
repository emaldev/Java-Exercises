import java.util.Scanner;
public class ArraySearchName {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] names = {"Sara", "Ali", "Eman", "Mhammad", "Milad", "Asef"};

        String target;

        boolean isFound = false;
        target = input.nextLine();

        for(int i= 0; i < names.length; i++){
            if(names[i].equals(target)){
                System.out.println(i);
                System.out.println(names[i]);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found !");
        }
    }
}
