package com.atj.first.animals.ducks;

public class WoodenDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Looks like wooden!");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Wooden duck cannot fly!");
    }

    @Override
    public void quack() {
        throw new UnsupportedOperationException("Wooden duck does not quack!");
    }
}
