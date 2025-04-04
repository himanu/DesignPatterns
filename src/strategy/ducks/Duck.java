package strategy.ducks;

import strategy.strategies.FlyBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void fly() {
        this.flyBehaviour.fly();
    }
}
