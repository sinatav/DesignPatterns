public class Soy extends Decorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

//    @Override
//    public String Operation() {
//        return super.Operation() + " " + addBehavior();
//    }

//    private String addBehavior() {
//        return "Add Soy";
//    }

    public String getDescription() {
        return beverage.getDescription() + " " + "with soy";
    }

    public double cost() {
        return 0.15 + beverage.cost();
    }

}