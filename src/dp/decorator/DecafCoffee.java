package dp.decorator;

public class DecafCoffee extends Beverage{
    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return "Decaf";
    }
}
