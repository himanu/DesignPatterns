package BuilderDesignPattern;

public class BurgerShop {
    public void activateBurgerShop() {
        // without decorator
        Burger cheeseBurger = new Burger.BurgerBuilder()
                .addBun("Sessame")
                .setHasCheese()
                .getBurger();

        // with decorator
        Burger cheeseSessameBurger = BurgerDecorator.getCheeseSessameBurger();
    }
}
