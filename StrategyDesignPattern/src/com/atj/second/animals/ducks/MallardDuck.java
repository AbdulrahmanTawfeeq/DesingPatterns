package com.atj.second.animals.ducks;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("Looks like a mallard!");
    }

    @Override
    public void fly() {
        System.out.println("Flying in a nice way!");
    }

    @Override
    public void quack() {
        System.out.println("Quacking loudly!");
    }
}
