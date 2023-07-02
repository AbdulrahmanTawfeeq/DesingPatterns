package com.atj.third.animals.ducks.behaviours;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Mute quack!");
    }
}
