package com.atj.third.animals.ducks;

import com.atj.third.animals.ducks.behaviours.FlyNoWay;
import com.atj.third.animals.ducks.behaviours.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Looks like rubber!");
    }
}
