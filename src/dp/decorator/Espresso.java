package dp.decorator;

public class Espresso extends Beverage {
    @Override
    public double cost() {
        return 0.89;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
