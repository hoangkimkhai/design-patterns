package dp.factory_v2;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String name, String cheese, String sauce) {
        Pizza pizza = null;
        if (name.equals("cheese")){
            pizza =  new ChicagoCheesePizza(name, cheese, sauce);
        }else if(name.equals("clam")){
            pizza = new ChicagoClamPizza(name, cheese, sauce);
        }else if(name.equals("veggie")){
            pizza = new ChicagoVeggiePizza(name, cheese, sauce);
        }
        return pizza;
    }
}
