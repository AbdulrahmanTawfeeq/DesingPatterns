package com.atj.third.animals.ducks;

import com.atj.third.animals.ducks.behaviours.FlyNoWay;
import com.atj.third.animals.ducks.behaviours.MuteQuack;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Looks like wooden!");
    }
}
