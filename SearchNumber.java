public class SearchNumber {
    public static void main(String[] args){
    int[] numbers = {12, 56, 34, 33, 78};
    int target = 22;
    boolean isFound = false;
    for(int i = 0; i< numbers.length; i++){
        if(target == numbers[i]){
            System.out.println("Elements fond " + i );
            isFound = true;
            break;
        }
       
    }
     if(!isFound){
            System.out.println("not found!");
            
        }
    }
}
