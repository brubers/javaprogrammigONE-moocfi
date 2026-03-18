
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();


        while(true){
            int newNumber = Integer.valueOf(scanner.nextLine());
            if (newNumber == 9999){
                break;
            }
            numbers.add(newNumber);
            
        }

        int smallest = numbers.get(0);
        for(int i = 0; i < numbers.size(); i++){
            int nowNumber = numbers.get(i);  
            if (smallest > nowNumber){
                smallest = nowNumber;
            }
        }
        System.out.println("Smallest number: "+smallest);

        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) == smallest){
                System.out.println("Found at index: "+i);
            }
        }

        
    }
}
