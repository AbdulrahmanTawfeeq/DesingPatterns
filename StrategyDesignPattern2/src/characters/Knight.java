package characters;

import behaviors.AxeBehavior;

public class Knight extends Character {
    public Knight() {
        weaponBehavior = new AxeBehavior();
    }
}
