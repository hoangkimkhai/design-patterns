package dp.factory_v2;

public class NYClamPizza extends Pizza{
    public NYClamPizza(String name, String cheese, String sauce) {
        super(name, cheese, sauce);
    }

    @Override
    public void bake() {
        System.out.println("Baking NewYork " + this.name + "pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting NewYork " + this.name + "pizza");

    }

    @Override
    public void pack() {
        System.out.println("Packing NewYork " + this.name + "pizza");


    }

    @Override
    public void deliver() {
        System.out.println("Delivering NewYork " + this.name + " " + this.cheese + "  " + this.sauce + " pizza");

    }
}
