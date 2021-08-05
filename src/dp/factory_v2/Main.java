package dp.factory_v2;

public class Main {
    public static void main(String[] args) {
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        NYPizzaStore nyPizzaStore = new NYPizzaStore();

       Pizza chi_cheese_pizza =  chicagoPizzaStore.createPizza("cheese", "much","tomato");
       Pizza ny_cheese_pizza = nyPizzaStore.createPizza("veggie", "little","potato");

       chi_cheese_pizza.prepare();
       ny_cheese_pizza.prepare();
    }
}
