package dp.factory_v2;

public abstract class Pizza {
    protected String name;
    protected String cheese;
    protected String sauce;

    public Pizza(String name, String cheese, String sauce) {
        this.name = name;
        this.cheese = cheese;
        this.sauce = sauce;
    }
    void prepare(){
        bake();
        cut();
        pack();
        deliver();
    }
    public abstract void bake();

    public abstract void cut();

    public abstract void pack();

    public abstract void deliver();
}
