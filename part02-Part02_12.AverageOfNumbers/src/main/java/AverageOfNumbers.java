
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int quantity = 0;
        
        while(true){
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == 0){
                break;
            }
            
            sum = sum + number;
            quantity = quantity + 1;
        }
        
        double average = (double)sum/quantity;
        System.out.println("Average of the numbers: "+average);
        

    }
}
