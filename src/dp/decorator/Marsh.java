package dp.decorator;

public class Marsh extends CondimentDecorator {
    public Marsh(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.4;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()  + ", Marsh";
    }
}
