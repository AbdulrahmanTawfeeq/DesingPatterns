package com.atj.second.animals.ducks;

public class RedheadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("Looks like a redhead!");
    }

    @Override
    public void fly() {
        System.out.println("Flying in another way!");
    }

    @Override
    public void quack() {
        System.out.println("Quacking loudly!");
    }
}
