public class Mocha extends Decorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " " + "with mocha";
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }
}