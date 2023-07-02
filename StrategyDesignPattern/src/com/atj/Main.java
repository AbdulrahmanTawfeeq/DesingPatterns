package com.atj;


import com.atj.third.animals.ducks.Duck;
import com.atj.third.animals.ducks.MallardDuck;
import com.atj.third.animals.ducks.ModelDuck;
import com.atj.third.animals.ducks.behaviours.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}