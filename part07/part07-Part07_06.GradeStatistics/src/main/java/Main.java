import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point points = new Point();
        UserInterface ui = new UserInterface(points, scanner);

        ui.start();
        
       
    }
}
