
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Name: ");
            String newItem = scanner.nextLine();
            if (newItem.equals("")) {
                break;
            }

            items.add(new Item(newItem));
        }

        for(Item i : items){
            System.out.println(i);
        }


    }
}
