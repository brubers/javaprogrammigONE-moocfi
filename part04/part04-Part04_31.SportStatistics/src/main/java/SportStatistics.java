
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scan.nextLine();

        System.out.println("Team: ");
        String team = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner scanner = new Scanner(Paths.get(fileName))){
            
            while (scanner.hasNextLine()) {
                
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                
                String firstTeam = parts[0];
                String secondTeam = parts[1];
                int firstScore = Integer.valueOf(parts[2]);
                int secondScore = Integer.valueOf(parts[3]);

                if (firstTeam.equals(team) || secondTeam.equals(team)) {
                    games++;
                }
                if (firstTeam.equals(team) && firstScore > secondScore) {
                    wins++;
                } else if (firstTeam.equals(team) && firstScore < secondScore){
                    losses++;
                }

                if (secondTeam.equals(team) && secondScore > firstScore) {
                    wins++;
                } else if (secondTeam.equals(team) && secondScore < firstScore){
                    losses++;
                }
            }


        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Games: "+ games);
        System.out.println("Wins: "+ wins);
        System.out.println("Losses: "+ losses);
    }

}
