
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        
        int pointGiven = Integer.valueOf(scan.nextLine());
        
        if (pointGiven < 0){
            System.out.println("Grade: impossible!");
        } else if (pointGiven <= 49){
            System.out.println("Grade: failed");
        } else if (pointGiven <= 59){
            System.out.println("Grade: 1");
        } else if (pointGiven <= 69){
            System.out.println("Grade: 2");
        } else if (pointGiven <= 79){
            System.out.println("Grade: 3");
        } else if (pointGiven <= 89){
            System.out.println("Grade: 4");
        } else if (pointGiven <= 100){
            System.out.println("Grade: 5");
        } else {
            System.out.println("incredible!");
        }
    }
}
