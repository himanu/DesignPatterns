package BuilderDesignPattern;

public class Burger {
    String bun;
    boolean hasCheese;
    boolean hasTomato;

    private Burger(BurgerBuilder burgerBuilder) {
        this.bun = burgerBuilder.bun;
        this.hasCheese = burgerBuilder.hasCheese;
        this.hasTomato = burgerBuilder.hasTomato;
    }

    public static class BurgerBuilder {
        String bun;
        boolean hasCheese;
        boolean hasTomato;

        public BurgerBuilder() {
            bun = "";
            hasTomato = false;
            hasCheese = false;
        }


        BurgerBuilder addBun(String bun) {
            this.bun = bun;
            return this;
        }

        BurgerBuilder setHasTomato() {
            this.hasTomato = true;
            return this;
        }

        BurgerBuilder setHasCheese() {
            this.hasCheese = true;
            return this;
        }

        Burger getBurger() {
            return new Burger(this);
        }
    }
}
