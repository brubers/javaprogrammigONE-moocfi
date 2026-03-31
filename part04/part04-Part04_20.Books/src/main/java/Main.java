import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String information = scanner.nextLine();
        if (information.equals("everything")) {
            for (Book book : books) {
                System.out.println(book.toString());
               
            }
        } else if (information.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }

    }
}
