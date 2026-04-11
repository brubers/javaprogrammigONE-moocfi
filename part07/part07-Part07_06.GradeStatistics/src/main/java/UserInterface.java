import java.util.Scanner;

public class UserInterface {
    private Point points;
    private Scanner scanner;

    public UserInterface(Point points, Scanner scanner){
        this.points = points;
        this.scanner = scanner;
    }

    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            points.add(input);
        }
        
        System.out.println("Point average (all): "+ points.average());

        if (points.averagePassing() == 0.0) {
            System.out.println("Point average(passing): -");
        } else {
            System.out.println("Point average(passing): "+points.averagePassing() );
        }

        System.out.println("Pass percentage: "+ points.passPercentage());
        System.out.println("Grade distribution: ");
        points.gradeDistribution();
    }

}
