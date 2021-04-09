public class Whip extends Decorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

//    @Override
//    public String Operation() {
//        return super.Operation() + " " + addBehavior();
//    }

//    private String addBehavior() {
//        return "Add Whip";
//    }

    public String getDescription() {
        return beverage.getDescription() + " " + "Add whip";
    }

    public double cost() {
        return 0.10 + beverage.cost();
    }

}