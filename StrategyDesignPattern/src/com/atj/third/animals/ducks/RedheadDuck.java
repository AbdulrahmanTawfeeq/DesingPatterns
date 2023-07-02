package com.atj.third.animals.ducks;

import com.atj.third.animals.ducks.behaviours.FlyWithWings;
import com.atj.third.animals.ducks.behaviours.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Looks like a redhead!");
    }
}
