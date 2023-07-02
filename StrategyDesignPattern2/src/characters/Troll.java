package characters;

import behaviors.KnifeBehavior;

public class Troll extends Character {
    public Troll() {
        weaponBehavior = new KnifeBehavior();
    }
}
