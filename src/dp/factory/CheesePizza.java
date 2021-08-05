package dp.factory;

public class CheesePizza extends Pizza {
    public CheesePizza(String type) {
        super(type);
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheese Pizza");
    }

    @Override
    public void pack() {
        System.out.println("Packing Cheese Pizza");

    }

    @Override
    public void deliver() {
        System.out.println("Delivering Cheese Pizza");

    }
}
