
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Password?");
        String passwordTried = scan.nextLine();
        String passwordDefined = "Caput Draconis";
        
        if (passwordTried.equals(passwordDefined)){
            System.out.println("Welcome!");
        } else{
            System.out.println("Off with you!");
        }
    }
}
