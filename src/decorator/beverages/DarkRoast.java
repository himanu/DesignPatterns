package decorator.beverages;

public class DarkRoast extends Coffee {
    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public Integer getCost() {
        return 15;
    }
}
