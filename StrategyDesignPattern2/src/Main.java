import behaviors.BowAndArrowBehavior;
import characters.Character;
import characters.*;

public class Main {
    public static void main(String[] args) {
        Character king = new King();
        Character queen = new Queen();
        Character knight = new Knight();
        Character troll = new Troll();
        action(king, queen, knight, troll);
        king.setWeaponBehavior(new BowAndArrowBehavior());
        action(king);
    }

    public static void action(Character... characters) {
        for (Character character : characters) {
            character.fight();
        }
    }
}