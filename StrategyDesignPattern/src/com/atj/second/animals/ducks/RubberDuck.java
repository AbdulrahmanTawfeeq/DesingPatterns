package com.atj.second.animals.ducks;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void display() {
        System.out.println("Looks like rubber!");
    }

    @Override
    public void quack() {
        System.out.println("Squeaking!");
    }
}
