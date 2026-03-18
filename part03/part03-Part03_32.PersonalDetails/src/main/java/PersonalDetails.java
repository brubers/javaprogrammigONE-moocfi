
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longest = 0;
        String longestName = "";
        int count = 0;
        int sum = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int lengthName = parts[0].length();

            if (lengthName > longest) {
                longest = lengthName;
                longestName = parts[0];
            }

            int birthYear = Integer.valueOf(parts[1]);
            sum += birthYear;
            count++;
        }
        double avg = (double) sum/count;
        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years: "+ avg);

    }
}
