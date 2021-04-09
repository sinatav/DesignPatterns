public class SteamedMilk extends Decorator {
    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

//    @Override
//    public String Operation() {
//        return super.Operation() + " " + addBehavior();
//    }

//    private String addBehavior() {
//        return "Add Milk";
//    }

    public String getDescription() {
        return beverage.getDescription() + " " + "with milk";
    }

    public double cost() {
        return 0.10 + beverage.cost();
    }
}