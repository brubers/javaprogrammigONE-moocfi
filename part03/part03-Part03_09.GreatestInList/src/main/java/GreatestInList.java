
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        int greatest = list.get(0); //for now, set the greatest as the first number 

        for(int i = 0; i < list.size(); i++){ //i < list.size() so the loop ends when we go through the whole list
            int number = list.get(i); // setting the variable number as the number we're now examining in the for loop
            if (greatest < number){
                greatest = number;
            }
        }

        System.out.println("The greatest number: "+greatest);
    }
}
