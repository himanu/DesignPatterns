package strategy;

import strategy.ducks.Duck;
import strategy.ducks.MallordDuck;
import strategy.strategies.FlyBehaviour2;

public class DuckApp {
    public static void activateGame() {
        Duck duck = new MallordDuck();
        duck.fly();

        // change the flying behaviour dynamically
        duck.setFlyBehaviour(new FlyBehaviour2());
        duck.fly();
    }
}
