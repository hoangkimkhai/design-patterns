package dp.factory;

public abstract class Pizza {
    String type;
    public Pizza(String type){
        this.type = type;
    }
    public abstract void bake();
    public abstract void pack();

    public abstract void deliver();

}
