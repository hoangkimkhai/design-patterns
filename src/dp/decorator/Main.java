package dp.decorator;

public class Main {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        Mocha es_mocha = new Mocha(espresso);
        Whip es_mocha_whip = new Whip(es_mocha);
        System.out.println(es_mocha_whip.cost() +", " + es_mocha_whip.getDescription());

    }
}
