
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean error = false;
        String password = null;

        System.out.println("Enter username: ");
        String username = scanner.nextLine();

        if(username.equals("alex")){
            password = "sunshine";
        } else if (username.equals("emma")) {
            password = "haskell";
        } else {
            error = true;
        }

        System.out.println("Enter password: ");
        String triedPassword = scanner.nextLine();
        if (!(triedPassword.equals(password))) {
            error = true;
        }

        if(error){
            System.out.println("Incorrect username or password!");
        } else{
            System.out.println("You have successfully logged in!");
        }
        

    }
}
