
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        boolean nameFound = false;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for?");
        String nameSearched = scanner.nextLine();
        
        for(String name : list){
            if (name.equals(nameSearched)){
                nameFound = true;
            }
        }

        if(!nameFound){
            System.out.println(nameSearched+" was not found!");
        } else {
            System.out.println(nameSearched+" was found!");
        }
        

    }
}
