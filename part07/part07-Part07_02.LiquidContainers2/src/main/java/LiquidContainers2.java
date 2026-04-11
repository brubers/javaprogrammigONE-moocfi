
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container container = new Container();
        Container container2 = new Container();
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner, container, container2);

        ui.start();

    }

}
