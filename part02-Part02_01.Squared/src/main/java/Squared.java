
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int number = Integer.valueOf(scan.nextLine());
        int squared = number * number;
        
        System.out.println(squared);
        

    }
}
