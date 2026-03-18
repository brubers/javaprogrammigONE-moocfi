
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        int quantity = 0;

        while(true){
            int newNumber = Integer.valueOf(scanner.nextLine());
            if (newNumber == -1){
                break;
            }
            numbers.add(newNumber);
        }

        for (int n : numbers){
            sum += n;
            quantity += 1;
        }

        double avg = (double) sum / quantity;
        System.out.println("Average: "+ avg);
        
    }
}
