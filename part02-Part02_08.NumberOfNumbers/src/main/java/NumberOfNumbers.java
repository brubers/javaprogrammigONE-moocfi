
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantity = 0;
        
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0){
                break;
            } else{
                quantity = quantity + 1;
            }
            
        }
        System.out.println("Number of numbers: "+quantity);
        

    }
}
