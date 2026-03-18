
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int quantity = 0;
        int even = 0;
        int odd = 0;
        double average = 0;
        System.out.println("Write numbers:");        
        
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == (-1)) {
                System.out.println("Thx! Bye!");
                break;
            }
            
            if(number % 2 == 0){
                even+= 1;    
            } else{
                odd+=1;
            }
            
            sum += number;    
            quantity += 1;
            average = (double) sum/quantity;
        }
        
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+quantity);
        System.out.println("Average: "+average);
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
