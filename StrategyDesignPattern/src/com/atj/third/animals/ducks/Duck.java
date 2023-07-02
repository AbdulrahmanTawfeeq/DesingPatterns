package com.atj.third.animals.ducks;

import com.atj.third.animals.ducks.behaviours.FlyBehaviour;
import com.atj.third.animals.ducks.behaviours.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void swim() {
        System.out.println("Duck is swimming!");
    }

    public void performFly() {
        if (flyBehaviour != null) {
            flyBehaviour.fly();
        }
    }

    public void performQuack() {
        if (quackBehaviour != null) {
            quackBehaviour.quack();
        }
    }

    public abstract void display();
}
