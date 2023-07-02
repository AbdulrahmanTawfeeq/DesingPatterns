package com.atj.third.animals.ducks.behaviours;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Fly no way!");
    }
}
