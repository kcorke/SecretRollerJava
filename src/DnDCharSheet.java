/*
    This class is designed to store the information that would appear on a Dungeons & Dragons 5E character sheet.
 */

public class DnDCharSheet {
    private String name;
    private int level;
    private int dexterity;

    private DnDCharSheet(String charName, int lvl, int dex){
        this.name = charName;
        this.level = lvl;
        this.dexterity = dex;
    }

    public static DnDCharSheet rollACharacter(String charName, int lvl, int dex){
        return new DnDCharSheet(charName, lvl, dex);
    }
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getDexterity() {
        return dexterity;
    }
}
