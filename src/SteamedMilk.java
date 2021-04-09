public class SteamedMilk extends Decorator {
    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " " + "with milk";
    }

    public double cost() {
        return 0.10 + beverage.cost();
    }
}