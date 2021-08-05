package dp.factory_v2;



public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String name, String cheese, String sauce) {
        Pizza pizza = null;
        if (name.equals("cheese")){
            pizza =  new NYCheesePizza(name, cheese, sauce);
        }else if(name.equals("clam")){
            pizza = new NYClamPizza(name, cheese, sauce);
        }else if(name.equals("veggie")){
            pizza = new NYVeggiePizza(name, cheese, sauce);
        }
        return pizza;
    }
}
