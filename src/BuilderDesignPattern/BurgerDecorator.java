package BuilderDesignPattern;

public class BurgerDecorator {
    public static Burger getCheeseSessameBurger() {
        return new Burger.BurgerBuilder().addBun("Sessame").setHasCheese().getBurger();
    }
}
