
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))){

            //reads the file until all lines have been read
            while(scanner.hasNextLine()){

                String row = scanner.nextLine(); //reads one line
                
                System.out.println(row); //print the line read

            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
