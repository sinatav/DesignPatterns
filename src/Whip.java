public class Whip extends Decorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " " + "with whip";
    }

    public double cost() {
        return 0.10 + beverage.cost();
    }

}