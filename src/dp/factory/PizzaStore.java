package dp.factory;

public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;
    public PizzaStore(SimplePizzaFactory factory){
        this.simplePizzaFactory = factory;
    }
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = simplePizzaFactory.createPizza(type);
        pizza.bake();
        pizza.pack();
        pizza.deliver();
        return pizza;
    }

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory =  new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza("veggie");
        pizzaStore.orderPizza("clam");
        pizzaStore.orderPizza("cheese");
    }
}
