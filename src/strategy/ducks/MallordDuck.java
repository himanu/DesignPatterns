package strategy.ducks;

import strategy.strategies.FlyBehaviour1;

public class MallordDuck extends Duck {
    public MallordDuck() {
        flyBehaviour = new FlyBehaviour1();
    }
}
