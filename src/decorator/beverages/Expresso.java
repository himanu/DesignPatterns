package decorator.beverages;

public class Expresso extends Coffee{
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public Integer getCost() {
        return 15;
    }
}
