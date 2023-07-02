package com.atj.third.animals.ducks;

import com.atj.third.animals.ducks.behaviours.FlyWithWings;
import com.atj.third.animals.ducks.behaviours.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Looks like a mallard!");
    }
}
