package decorator.decorators;

import decorator.beverages.Coffee;

public class MilkDecorator extends Decorator{
    Coffee coffee;
    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String getDescription() {
        return "Milk " + coffee.getDescription();
    }

    @Override
    public Integer getCost() {
        return 1 + coffee.getCost();
    }
}
