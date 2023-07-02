package com.atj.third.animals.ducks;

import com.atj.third.animals.ducks.behaviours.FlyNoWay;
import com.atj.third.animals.ducks.behaviours.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Looks like model duck!");
    }
}
