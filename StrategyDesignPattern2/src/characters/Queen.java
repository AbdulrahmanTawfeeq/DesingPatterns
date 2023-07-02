package characters;

import behaviors.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
