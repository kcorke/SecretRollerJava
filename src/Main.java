import java.util.Scanner;

public class Main {
    static int gamesys = 0;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please choose your desired game system.");
        System.out.println("Enter 1 for Dungeons & Dragons 5e or 2 for Pathfinder 2e.");
        int mode = userInput.nextInt();
        gamesys = mode;
        if(gamesys == 1){
            System.out.println("Chosen system is Dungeons & Dragons 5e.");
        } else if (gamesys == 2) {
            System.out.println("Chosen system is Pathfinder 2e.");
        } else if (gamesys == 0){
            System.out.println("No system chosen.");
        } else {
            System.out.println("System not supported.");
        }
    }
}