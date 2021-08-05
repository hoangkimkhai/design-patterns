package dp.factory;

import java.util.Locale;

public class ClamPizza extends Pizza {
    public ClamPizza(String type) {
        super(type);
    }

    @Override
    public void bake() {
        System.out.println("Baking " + type.toUpperCase(Locale.ROOT) + " pizza");
    }

    @Override
    public void pack() {
        System.out.println("Packing " + type.toUpperCase(Locale.ROOT) + " pizza");

    }

    @Override
    public void deliver() {
        System.out.println("Delivering " + type.toUpperCase(Locale.ROOT) + " pizza");

    }

}
