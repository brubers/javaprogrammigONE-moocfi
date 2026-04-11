import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Container container;
    private Container container2;

    public UserInterface(Scanner scanner, Container container, Container container2){
        this.scanner = scanner;
        this.container = container;
        this.container2 = container2;
    }

    public void start(){
        while (true) {
            System.out.println("First: "+container);
            System.out.println("Second: "+container2);

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            System.out.println();

             if (command.equals("add")) {
                container.add(amount);

             } else if (command.equals("move")) {
                if (amount > container.contains()) {
                    container2.add(container.contains());
                } else {
                    container2.add(amount);
                }
                container.remove(amount);

             } else if (command.equals("remove")) {
                container2.remove(amount);
                
             }
        }
    }



}
