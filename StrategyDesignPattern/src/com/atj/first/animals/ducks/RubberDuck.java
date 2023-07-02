package com.atj.first.animals.ducks;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Looks like rubber!");
    }

    @Override
    public void quack() {
        System.out.println("Duck is squeaking!");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Rubber duck cannot fly!");
    }
}
