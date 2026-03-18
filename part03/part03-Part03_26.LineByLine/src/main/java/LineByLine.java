
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String userString = scanner.nextLine();

            if(userString.equals("")){
                break;
            }

            String[] pieces = userString.split(" ");
            
            for(String piece : pieces){
                System.out.println(piece);
            }


        }


    }
}
