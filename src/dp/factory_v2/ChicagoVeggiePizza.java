package dp.factory_v2;

public class ChicagoVeggiePizza extends Pizza{
    public ChicagoVeggiePizza(String name, String cheese, String sauce) {
        super(name, cheese, sauce);
    }

    @Override
    public void bake() {
        System.out.println("Baking Chicago " + this.name + "pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Chicago " + this.name + "pizza");

    }

    @Override
    public void pack() {
        System.out.println("Packing Chicago " + this.name + "pizza");


    }

    @Override
    public void deliver() {
        System.out.println("Delivering Chicago " + this.name + " " + this.cheese + "  " + this.sauce + " pizza");

    }
}
