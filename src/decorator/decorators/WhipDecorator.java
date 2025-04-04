package decorator.decorators;

import decorator.beverages.Coffee;

public class WhipDecorator extends Decorator {
    Coffee coffee;
    public WhipDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return "Whip " + coffee.getDescription();
    }

    @Override
    public Integer getCost() {
        return 2 + coffee.getCost();
    }
}
