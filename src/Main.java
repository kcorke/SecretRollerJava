import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Secret Roller is a program designed to allow a Game Master (hereafter GM) for either a Dungeons and Dragons Fifth
    Edition or a Pathfinder Second Edition game to secretly roll skill checks for their players. During play, there are
    times when a player must roll a skill check to see if they succeed at a task, but by the circumstances should not
    know exactly what was rolled (for example, attempting to sneak past a guard, where the player could potentially
    know how well they have succeeded based on the number rolled, but should not be privy to that information). This
    program will allow the GM to make those rolls by inputting their players information and prompting for the correct
    skill roll.
 */

public class Main {
    static int gamesys = 0;
    static List<DnDCharSheet> dndChars = new ArrayList<DnDCharSheet>();
    static List<PF2eCharSheet> pf2eChars = new ArrayList<PF2eCharSheet>();

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please choose your desired game system.");
        System.out.println("Enter 1 for Dungeons & Dragons 5e or 2 for Pathfinder 2e.");
        gamesys= Integer.parseInt(userInput.nextLine());
        if(gamesys == 1){
            System.out.println("Chosen system is Dungeons & Dragons 5e.");
        } else if (gamesys == 2) {
            System.out.println("Chosen system is Pathfinder 2e.");
        } else if (gamesys == 0){
            System.out.println("No system chosen.");
        } else {
            System.out.println("System not supported.");
        }
        rollCharacters(userInput);
        System.out.println(dndChars.size());
    }

    /*
        rollCharacters is designed to take user input in a loop for as many players/characters the GM has at their
        table.
     */
    public static void rollCharacters(Scanner userInput){
        boolean on = true;
        while(on){
            DnDCharSheet nextCharacter = buildDnDCharacter(userInput);
            dndChars.add(nextCharacter);
            System.out.println("Is there another character? 1 for yes, 2 for no.");
            int more = Integer.parseInt(userInput.nextLine());
            on = (more == 1);
        }
    }

    /*
        buildDnDCharacter is a function designed to build a single DnDCharacterSheet representing one character/player
        at the GM's table.
     */
    public static DnDCharSheet buildDnDCharacter(Scanner userInput){
        String charName;
        int lvl;
        int dex;
        System.out.println("Please enter character's name.");
        charName = userInput.nextLine();
        System.out.println("Please enter character's level.");
        lvl = Integer.parseInt(userInput.nextLine());
        System.out.println("Please enter character's dexterity score.");
        dex = Integer.parseInt(userInput.nextLine());
        return DnDCharSheet.rollACharacter(charName, lvl, dex);
    }
}