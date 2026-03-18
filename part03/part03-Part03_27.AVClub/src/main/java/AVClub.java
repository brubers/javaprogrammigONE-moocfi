
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String userString = scanner.nextLine();
            if(userString.equals("")){
                break;
            }
            String [] strings = userString.split(" ");

            for(String word : strings){
                if(word.contains("av")){
                    System.out.println(word);
                }
            }

        }

    }
}
