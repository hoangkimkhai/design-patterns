package dp.factory;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza =  new CheesePizza(type);
        }else if(type.equals("clam")){
            pizza = new ClamPizza(type);
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza(type);
        }
        return pizza;
    }
}
