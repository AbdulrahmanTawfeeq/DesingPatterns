package com.atj.third.animals.ducks.behaviours;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeaking!");
    }
}
