public class Mocha extends Decorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

//    @Override
//    public String Operation() {
//        return super.Operation() + " " + addBehavior();
//    }

//    private String addBehavior() {
//        return "Add Mocha";
//    }

    public String getDescription() {
        return beverage.getDescription() + " " + "Add mocha";
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }
}