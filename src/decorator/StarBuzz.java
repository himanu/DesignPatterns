package decorator;

import decorator.beverages.Coffee;
import decorator.beverages.DarkRoast;
import decorator.beverages.Expresso;
import decorator.decorators.MilkDecorator;
import decorator.decorators.WhipDecorator;

public class StarBuzz {

    public void usePattern() {
        // make a double whipped expresso
        Coffee coffee = new Expresso();
        coffee = new MilkDecorator(coffee);
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription());

        // make a milk whipped dark roast coffee
        coffee = new DarkRoast();
        coffee = new WhipDecorator(coffee);
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription());
    }
}
