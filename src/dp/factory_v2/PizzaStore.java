package dp.factory_v2;

public abstract class PizzaStore {
    public Pizza orderPizza(String name, String cheese, String sauce){
        return createPizza(name, cheese, sauce);
    }
    public abstract Pizza createPizza(String name, String cheese, String sauce);
}
