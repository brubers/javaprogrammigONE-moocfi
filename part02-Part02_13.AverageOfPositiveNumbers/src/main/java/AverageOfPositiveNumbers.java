
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveNumbers = 0;
        int positiveSum = 0;
        
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == 0){
                break;
            } else if (number > 0){
                positiveSum = positiveSum + number;
                positiveNumbers = positiveNumbers + 1;
            }
        }
        
        if(positiveNumbers == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) positiveSum/positiveNumbers);
        }

    }
}
